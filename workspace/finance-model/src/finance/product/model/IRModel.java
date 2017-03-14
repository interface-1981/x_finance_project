package finance.product.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import finance.common.CommonConstants;
import finance.common.CommonUtil;
import finance.product.entity.Cashflow;
import finance.product.entity.Leg;
import finance.product.entity.Reset;
import finance.product.entity.Reset.ResetPK;
import finance.product.types.AmortType;
import finance.product.types.CashflowType;
import finance.product.types.FixOrFloat;
import finance.product.types.Position;
import finance.product.types.RateIndex;

public class IRModel extends Product{

	public IRModel() {
	}

	@Override
	public void generateCashflows() {

		for(Leg l : super.getTrade().getLegs()) {

			int cflNumber = 0;
			List<Cashflow> cashflows = new ArrayList<Cashflow>();
			l.setCashflows(cashflows);

			Calendar payDate = Calendar.getInstance();
			payDate.setTime(super.getTrade().getStartDate());
			payDate.add(Calendar.MONTH, super.getTerm(l.getPaymentFrequency()).termNum);

			Calendar lastPayDate = Calendar.getInstance();
			lastPayDate.setTime(super.getTrade().getStartDate());

			Calendar fixedDate;
			if(FixOrFloat.Float.equals(this.getFixOrFloat(l.getFixOrFloat()))) {
				fixedDate = Calendar.getInstance();
				fixedDate.setTime(super.getTrade().getStartDate());
				fixedDate.add(Calendar.MONTH, this.getRateIndex(l.getRateIndex()).termNum);
			} else {
				fixedDate = CommonConstants.MAX_DATE_CALENDAR;
			}
			Calendar lastFixedDate = Calendar.getInstance();
			lastFixedDate.setTime(super.getTrade().getStartDate());

			Calendar amortDate = Calendar.getInstance();
			amortDate.setTime(super.getTrade().getStartDate());
			amortDate.add(Calendar.MONTH, super.getTerm(l.getAmortFrequency()).termNum);

			Calendar lastAmortDate = Calendar.getInstance();
			lastAmortDate.setTime(super.getTrade().getStartDate());

			if(l.getAmortType() == null
					|| CommonUtil.isEmpty(l.getAmortType())
					|| AmortType.None.toString().equals(l.getAmortType())) {
				amortDate = CommonConstants.MAX_DATE_CALENDAR;
			}

			int lastPrincipalAmount = l.getPrincipalAmount();
			Date lastInerestPayDate = super.getTrade().getStartDate();

			Cashflow c = new Cashflow();
			cashflows.add(c);

			//初回CFL
			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			c.setCashflowType(CashflowType.Principal.toString());

			if(Position.Pay.toString().equals(l.getPayOrRec())) {
				c.setPayAmount(l.getPrincipalAmount());
				c.setPrincipalAmount(l.getPrincipalAmount());

			} else {
				c.setPayAmount(l.getPrincipalAmount() * -1);
				c.setPrincipalAmount(l.getPrincipalAmount() * -1);
			}
			c.setPayDate(super.getTrade().getStartDate());

			//利払、アモチCFL
			while (payDate.getTime().getTime() <= super.getTrade().getMaturityDate().getTime()
					|| amortDate.getTime().getTime() <= super.getTrade().getMaturityDate().getTime()) {

				int amortAmount = 0;
				//元本金額の計算
				if (amortDate.getTime().getTime() <= payDate.getTime().getTime()) {

					c = new Cashflow();
					cashflows.add(c);

					c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
					c.setCashflowType(CashflowType.Principal.toString());

					if(AmortType.Amount.toString().equals(l.getAmortType())) {
						amortAmount = l.getAmortAmount();

					} else if(AmortType.Rate.toString().equals(l.getAmortType())) {
						amortAmount = (int)(lastPrincipalAmount * l.getAmortRate());
					}

					c.setPrincipalAmount(lastPrincipalAmount - amortAmount);
					c.setAmortAmount(amortAmount);
					c.setPayAmount(amortAmount);
					c.setPayDate(amortDate.getTime());

					//Positionによる符号の反転
					if(Position.Pay.toString().equals(l.getPayOrRec())) {
						c.setAmortAmount(c.getAmortAmount() * -1);
					} else {
						c.setPrincipalAmount(c.getPrincipalAmount() * -1);
					}

					lastPrincipalAmount = lastPrincipalAmount - amortAmount;
				}

				//利息額の計算
				if (amortDate.getTime().getTime() >= payDate.getTime().getTime()) {

					c = new Cashflow();
					cashflows.add(c);

					c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
					if (FixOrFloat.Fixed.toString().equals(l.getFixOrFloat())) {
						c.setCashflowType(CashflowType.FixedInterest.toString());
					} else {
						c.setCashflowType(CashflowType.FloatInterest.toString());
					}
					//Positionによる符号の反転
					if(Position.Pay.toString().equals(l.getPayOrRec())) {
						c.setPrincipalAmount(lastPrincipalAmount);
					} else {
						c.setPrincipalAmount(lastPrincipalAmount * -1);
					}
					c.setPayDate(payDate.getTime());
					//リセットの設定
					c.setResets(this.generateResets(l, lastFixedDate, fixedDate, lastFixedDate.getTime(), payDate.getTime()));
					//利息額の設定
					c.setPayAmount(this.getInterestAmount(lastInerestPayDate, c));
					Calendar wkCal = Calendar.getInstance();
					wkCal.setTime(c.getPayDate());
					lastInerestPayDate = wkCal.getTime();
				}

				if (payDate.getTime().getTime() == super.getTrade().getMaturityDate().getTime()
						&& amortDate.getTime().getTime() >= payDate.getTime().getTime()) {
					break;
				}

				if (amortDate.getTime().getTime() == payDate.getTime().getTime()) {
					lastAmortDate = Calendar.getInstance();
					lastAmortDate.setTime(amortDate.getTime());
					amortDate.add(Calendar.MONTH, super.getTerm(l.getAmortFrequency()).termNum);

					lastPayDate = Calendar.getInstance();
					lastPayDate.setTime(payDate.getTime());
					payDate.add(Calendar.MONTH, super.getTerm(l.getPaymentFrequency()).termNum);
				}else if (amortDate.getTime().getTime() <= payDate.getTime().getTime()) {
					lastAmortDate = Calendar.getInstance();
					lastAmortDate.setTime(amortDate.getTime());
					amortDate.add(Calendar.MONTH, super.getTerm(l.getAmortFrequency()).termNum);

				}else if (amortDate.getTime().getTime() >= payDate.getTime().getTime()) {
					lastPayDate = Calendar.getInstance();
					lastPayDate.setTime(payDate.getTime());
					payDate.add(Calendar.MONTH, super.getTerm(l.getPaymentFrequency()).termNum);
				}

			}

			//最終利息（端数）
			if (payDate.getTime().getTime() > super.getTrade().getMaturityDate().getTime()) {
				c = new Cashflow();
				cashflows.add(c);
				c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
				if (FixOrFloat.Fixed.toString().equals(l.getFixOrFloat())) {
					c.setCashflowType(CashflowType.FixedInterest.toString());
				} else {
					c.setCashflowType(CashflowType.FloatInterest.toString());
				}

				c.setPayDate(super.getTrade().getMaturityDate());
				if(Position.Pay.toString().equals(l.getPayOrRec())) {
					c.setPrincipalAmount(lastPrincipalAmount);

				} else {
					c.setPrincipalAmount(lastPrincipalAmount * -1);
				}
				//リセットの設定
				List<Reset> resets = new ArrayList<Reset>();
				lastFixedDate.setTime(fixedDate.getTime());
				this.addReset(resets, lastFixedDate, fixedDate, lastPayDate.getTime(), super.getTrade().getMaturityDate(), l);
				c.setResets(resets);

				//利息額の計算
				c.setPayAmount(this.getInterestAmount(lastInerestPayDate, c));
			}

			//最終CFL
			c = new Cashflow();
			cashflows.add(c);
			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			c.setCashflowType(CashflowType.Principal.toString());

			if(Position.Pay.toString().equals(l.getPayOrRec())) {
				c.setPayAmount(lastPrincipalAmount * -1);
			} else {
				c.setPayAmount(lastPrincipalAmount);
			}
			c.setPayDate(super.getTrade().getMaturityDate());

		}
	}

	private List<Reset> generateResets(Leg leg, Calendar lastFixedDate, Calendar fixedDate, Date lastPayDate, Date payDate) {

		List<Reset> resets = new ArrayList<Reset>();
		if(FixOrFloat.Fixed.equals(leg.getFixOrFloat())
				|| fixedDate.getTime().getTime() > payDate.getTime()) {

			this.addReset(resets, lastFixedDate, fixedDate, lastFixedDate.getTime(), payDate, leg);
		} else {
			while(fixedDate.getTime().getTime() < payDate.getTime()) {
				this.addReset(resets, lastFixedDate, fixedDate, lastFixedDate.getTime(), fixedDate.getTime(), leg);
				lastFixedDate.setTime(fixedDate.getTime());
				fixedDate.add(Calendar.MONTH, this.getRateIndex(leg.getRateIndex()).termNum);

			}

			if(lastFixedDate.getTime().getTime() < payDate.getTime()) {
				this.addReset(resets, lastFixedDate, fixedDate, lastPayDate, payDate, leg);
			}
		}
		return resets;
	}

	private void addReset(List<Reset> resets, Calendar lastFixedDate, Calendar fixedDate,  Date lastPayDate, Date payDate, Leg leg) {

		int resetnumber = 0;
		int lastNotionalPrincipal = 0;
		Date tmpLastPayDate = new Date();
		tmpLastPayDate.setTime(lastPayDate.getTime());
		for(Cashflow c : leg.getCashflows()) {

			if(lastFixedDate.getTime().getTime() < c.getPayDate().getTime()
					&& payDate.getTime() >= c.getPayDate().getTime()
					&& CashflowType.Principal.toString().equals(c.getCashflowType())) {
				Reset r = new Reset();
				r.setResetPK(new ResetPK(c.getCashflowPK(), resetnumber));
				r.setStartDate(tmpLastPayDate);
				r.setEndDate(c.getPayDate());
				r.setNotionalPrincipal(lastNotionalPrincipal);
				if (this.getFixOrFloat(leg.getFixOrFloat()) == FixOrFloat.Fixed) {
					r.setContractRate(leg.getRate());
				} else {
					r.setContractRate(0.0);
					r.setRateFixDate(fixedDate.getTime());
				}

				r.setSpread(0.0);
				resets.add(r);
				++resetnumber;
				tmpLastPayDate = new Date();
				tmpLastPayDate.setTime(c.getPayDate().getTime());

			}
			lastNotionalPrincipal = c.getPrincipalAmount();
		}

		if (tmpLastPayDate.getTime() < payDate.getTime()) {

			Reset r = new Reset();
			r.setResetPK(new ResetPK(leg.getCashflows().get(0).getCashflowPK(), resetnumber));
			r.setStartDate(tmpLastPayDate);
			r.setEndDate(payDate);
			r.setNotionalPrincipal(lastNotionalPrincipal);
			if (this.getFixOrFloat(leg.getFixOrFloat()) == FixOrFloat.Fixed) {
				r.setContractRate(leg.getRate());
			} else {
				r.setContractRate(0.0);
				r.setRateFixDate(fixedDate.getTime());
			}

			r.setSpread(0.0);
			resets.add(r);
		}
	}
	private int getInterestAmount(Date lastInerestPayDate, Cashflow cashflow) {

		double interestAmount = 0.0;
		if(cashflow.getResets() != null) {
			for(Reset r : cashflow.getResets()) {
				long diffDays = (r.getEndDate().getTime() - r.getStartDate().getTime()) / ( 24 * 60 * 60 * 1000 );
				interestAmount += ((double)cashflow.getPrincipalAmount() * r.getContractRate() * (double)diffDays / 365.0) * -1;
			}
		}
		return (int)interestAmount;
	}

	public FixOrFloat getFixOrFloat(String fixOrFloat ){

		if(FixOrFloat.Fixed.toString().equals(fixOrFloat)){
			return FixOrFloat.Fixed;
		} else if(FixOrFloat.Float.toString().equals(fixOrFloat)){
			return FixOrFloat.Float;
		} else {
			return null;
		}
	}

	public RateIndex getRateIndex(String rateIndexID) {

		if(RateIndex.JPTI1M.rateIndexID.equals(rateIndexID)){
			return RateIndex.JPTI1M;
		}else if(RateIndex.JPTI3M.rateIndexID.equals(rateIndexID)){
			return RateIndex.JPTI3M;
		}else if(RateIndex.JPTI6M.rateIndexID.equals(rateIndexID)){
			return RateIndex.JPTI6M;
		}else if(RateIndex.JPTI12M.rateIndexID.equals(rateIndexID)){
			return RateIndex.JPTI12M;
		} else {
			return null;
		}
	}

	public AmortType getAmortType(String amortType){

		if(AmortType.Amount.toString().equals(amortType)){
			return AmortType.Amount;
		} else if(AmortType.Rate.toString().equals(amortType)){
			return AmortType.Rate;
		} else {
			return null;
		}
	}
}