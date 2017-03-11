package product.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import product.common.CommonConstants;
import product.common.CommonUtil;
import product.entity.Cashflow;
import product.entity.Cashflow.CashflowPK;
import product.entity.Leg;
import product.entity.Reset;
import product.entity.Reset.ResetPK;
import product.types.AmortType;
import product.types.CashflowType;
import product.types.FixOrFloat;
import product.types.LoanOrDeposit;
import product.types.Position;
import product.types.RateIndex;
import product.types.Term;

public class Cash extends Product{

	public Cash() {
		super.getTrade().setProduct(ProductType.Cash.toString());
		List<Leg> legs = new ArrayList<Leg>();
		Leg leg = new Leg();
		legs.add(leg);
		super.getTrade().setLegs(legs);
		super.setProductType(ProductType.Cash);
	}
	public Cash(int tradeID) {
		super(tradeID, ProductType.Cash);
	}
	public void initialize(int tradeID) {
		super.initialize(tradeID, ProductType.Cash);
	}
	public Date getStartDate(){
		return super.getTrade().getStartDate();
	}
	public void setStartDate(Date startDate){
		super.getTrade().setStartDate(startDate);
	}

	public Date getMaturityDate(){
		return super.getTrade().getMaturityDate();
	}
	public void setMaturityDate(Date maturityDate){
		super.getTrade().setExpiryDate(maturityDate);
		super.getTrade().setMaturityDate(maturityDate);

	}

	public String getCurrency(){
		return super.getTrade().getLegs().get(0).getCurrency();
	}
	public void setCurrency(String currency){
		super.getTrade().getLegs().get(0).setCurrency(currency);
	}
	public int getPrincipalAmount(){
		return super.getTrade().getLegs().get(0).getPrincipalAmount();
	}
	public void setPrincipalAmount(int amount){
		super.getTrade().getLegs().get(0).setPrincipalAmount(amount);
	}

	public FixOrFloat getFixOrFloat(){

		if(FixOrFloat.Fixed.toString().equals(super.getTrade().getLegs().get(0).getFixOrFloat())){
			return FixOrFloat.Fixed;
		} else if(FixOrFloat.Float.toString().equals(super.getTrade().getLegs().get(0).getFixOrFloat())){
			return FixOrFloat.Float;
		} else {
			return null;
		}
	}
	public void setFixOrFloat(FixOrFloat fixOrFloatTypes){
		super.getTrade().getLegs().get(0).setFixOrFloat(fixOrFloatTypes.toString());
	}

	public AmortType getAmortType(){

		if(AmortType.Amount.toString().equals(super.getTrade().getLegs().get(0).getAmortType())){
			return AmortType.Amount;
		} else if(AmortType.Rate.toString().equals(super.getTrade().getLegs().get(0).getAmortType())){
			return AmortType.Rate;
		} else {
			return null;
		}
	}
	public void setAmortType(AmortType amortType){
		super.getTrade().getLegs().get(0).setAmortType(amortType.toString());
	}

	public LoanOrDeposit getLoanOrDeposit(){

		if(LoanOrDeposit.Deposit.payOrRec.toString().equals(super.getTrade().getLegs().get(0).getPayOrRec())){
			return LoanOrDeposit.Deposit;
		} else if(LoanOrDeposit.Loan.payOrRec.equals(super.getTrade().getLegs().get(0).getPayOrRec())){
			return LoanOrDeposit.Loan;
		} else {
			return null;
		}
	}
	public void setLoanOrDeposit(LoanOrDeposit loanOrDeposit){
		super.getTrade().getLegs().get(0).setPayOrRec(loanOrDeposit.payOrRec);
	}

	public double getRate() {
		return super.getTrade().getLegs().get(0).getRate();
	}
	public void setRate(double rate) {
		super.getTrade().getLegs().get(0).setRate(rate);
	}
	public double getSpread() {
		return 0;//super.getTrade().getLegs().get(0).getRate();
	}
	public void setSpread(double rate) {
		//super.getTrade().getLegs().get(0).setRate(rate);
	}

	public void setRateIndex(RateIndex rateIndex){
		super.getTrade().getLegs().get(0).setRateIndex(rateIndex.rateIndexID);
	}
	public RateIndex getRateIndex() {

		if(RateIndex.JPTI1M.rateIndexID.equals(super.getTrade().getLegs().get(0).getRateIndex())){
			return RateIndex.JPTI1M;
		}else if(RateIndex.JPTI3M.rateIndexID.equals(super.getTrade().getLegs().get(0).getRateIndex())){
			return RateIndex.JPTI3M;
		}else if(RateIndex.JPTI6M.rateIndexID.equals(super.getTrade().getLegs().get(0).getRateIndex())){
			return RateIndex.JPTI6M;
		}else if(RateIndex.JPTI12M.rateIndexID.equals(super.getTrade().getLegs().get(0).getRateIndex())){
			return RateIndex.JPTI12M;
		} else {
			return null;
		}
	}
	public void setPaymentFrequency(Term term){
		super.getTrade().getLegs().get(0).setPaymentFrequency(term.termStr);
	}

	public Term getPaymentFrequency() {

		if(Term._1m.termStr.equals(super.getTrade().getLegs().get(0).getPaymentFrequency())){
			return Term._1m;
		}else if(Term._3m.termStr.equals(super.getTrade().getLegs().get(0).getPaymentFrequency())){
			return Term._3m;
		}else if(Term._6m.termStr.equals(super.getTrade().getLegs().get(0).getPaymentFrequency())){
			return Term._6m;
		}else if(Term._12m.termStr.equals(super.getTrade().getLegs().get(0).getPaymentFrequency())){
			return Term._12m;
		}else {
			return null;
		}
	}

	public Term getAmortFrequency() {

		if(Term._1m.termStr.equals(super.getTrade().getLegs().get(0).getAmortFrequency())){
			return Term._1m;
		}else if(Term._3m.termStr.equals(super.getTrade().getLegs().get(0).getAmortFrequency())){
			return Term._3m;
		}else if(Term._6m.termStr.equals(super.getTrade().getLegs().get(0).getAmortFrequency())){
			return Term._6m;
		}else if(Term._12m.termStr.equals(super.getTrade().getLegs().get(0).getAmortFrequency())){
			return Term._12m;
		}else {
			return null;
		}
	}
	public void setAmortFrequency(Term term){
		super.getTrade().getLegs().get(0).setAmortFrequency(term.termStr);
	}
	public double getAmortRate(){
		return super.getTrade().getLegs().get(0).getAmortRate();
	}

	public void setAmortRate(double amortRate){
		super.getTrade().getLegs().get(0).setAmortRate(amortRate);
	}

	public int getAmortAmount(){
		return super.getTrade().getLegs().get(0).getAmortAmount();
	}

	public void setAmortAmount(int amortAmount){
		super.getTrade().getLegs().get(0).setAmortAmount(amortAmount);
	}

	public List<Cashflow> getCashflows() {
		return this.getTrade().getLegs().get(0).getCashflows();
	}
	public void setCashflows(List<Cashflow> cashflows) {
		this.getTrade().getLegs().get(0).setCashflows(cashflows);
	}
	@Override
	public void generateCashflows() {
		int cflNumber = 0;
		List<Leg> legs = super.getTrade().getLegs();
		Leg l = legs.get(0);
		List<Cashflow> cashflows = new ArrayList<Cashflow>();

		Calendar payDate = Calendar.getInstance();
		payDate.setTime(this.getStartDate());
		payDate.add(Calendar.MONTH, this.getPaymentFrequency().termNum);

		Calendar lastPayDate = Calendar.getInstance();
		lastPayDate.setTime(this.getStartDate());

		Calendar fixedDate;
		if(FixOrFloat.Float.equals(getFixOrFloat())) {
			fixedDate = Calendar.getInstance();
			fixedDate.setTime(this.getStartDate());
			fixedDate.add(Calendar.MONTH, this.getRateIndex().termNum);
		} else {
			fixedDate = CommonConstants.MAX_DATE_CALENDAR;
		}
		Calendar lastFixedDate = Calendar.getInstance();
		lastFixedDate.setTime(this.getStartDate());

		Calendar amortDate = Calendar.getInstance();
		amortDate.setTime(this.getStartDate());
		amortDate.add(Calendar.MONTH, this.getRateIndex().termNum);

		Calendar lastAmortDate = Calendar.getInstance();
		lastAmortDate.setTime(this.getStartDate());

		if(l.getAmortType() == null
				|| CommonUtil.isEmpty(l.getAmortType())
				|| AmortType.None.toString().equals(l.getAmortType())) {
			amortDate = CommonConstants.MAX_DATE_CALENDAR;
		}

		int lastPrincipalAmount = l.getPrincipalAmount();
		Date lastInerestPayDate = this.getStartDate();

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
		c.setPayDate(this.getStartDate());

		//利払、アモチCFL
		while (payDate.getTime().getTime() <= this.getMaturityDate().getTime()
				|| amortDate.getTime().getTime() <= this.getMaturityDate().getTime()) {

			c = new Cashflow();
			cashflows.add(c);

			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			if (FixOrFloat.Fixed.toString().equals(l.getFixOrFloat())) {
				c.setCashflowType(CashflowType.FixedInterest.toString());
			} else {
				c.setCashflowType(CashflowType.FloatInterest.toString());
			}
			Date wkPayDate = payDate.getTime();
			int amortAmount = 0;
			//元本金額の計算
			if (amortDate.getTime().getTime() <= payDate.getTime().getTime()) {

				if(AmortType.Amount.toString().equals(l.getAmortType())) {
					amortAmount = l.getAmortAmount();

				} else if(AmortType.Rate.toString().equals(l.getAmortType())) {
					amortAmount = (int)(lastPrincipalAmount * l.getAmortRate());
				}

				c.setPrincipalAmount(lastPrincipalAmount - amortAmount);
				c.setAmortAmount(amortAmount);

				wkPayDate = amortDate.getTime();
				lastPrincipalAmount = lastPrincipalAmount - amortAmount;
			} else {
				c.setPrincipalAmount(lastPrincipalAmount);
			}

			if(Position.Rec.toString().equals(l.getPayOrRec())) {
				c.setPrincipalAmount(c.getPrincipalAmount() * -1);
			} else {
				c.setAmortAmount(c.getAmortAmount() * -1);
			}
			//リセットの設定
			c.setResets(this.generateResets(l, lastFixedDate, fixedDate, wkPayDate, c.getCashflowPK()));
			c.setPayDate(wkPayDate);

			//利息額の計算
			if (amortDate.getTime().getTime() >= payDate.getTime().getTime()) {
				c.setPayAmount(this.getInterestAmount(lastInerestPayDate, cashflows));
				Calendar wkCal = Calendar.getInstance();
				wkCal.setTime(c.getPayDate());
				lastInerestPayDate = wkCal.getTime();
			}

			if (payDate.getTime().getTime() == this.getMaturityDate().getTime()) {
				break;
			}

			if (amortDate.getTime().getTime() == payDate.getTime().getTime()) {
				lastAmortDate = Calendar.getInstance();
				lastAmortDate.setTime(amortDate.getTime());
				amortDate.add(Calendar.MONTH, this.getAmortFrequency().termNum);

				lastPayDate = Calendar.getInstance();
				lastPayDate.setTime(payDate.getTime());
				payDate.add(Calendar.MONTH, this.getPaymentFrequency().termNum);
			}else if (amortDate.getTime().getTime() <= payDate.getTime().getTime()) {
				lastAmortDate = Calendar.getInstance();
				lastAmortDate.setTime(amortDate.getTime());
				amortDate.add(Calendar.MONTH, this.getAmortFrequency().termNum);
			}else if (amortDate.getTime().getTime() >= payDate.getTime().getTime()) {
				lastPayDate = Calendar.getInstance();
				lastPayDate.setTime(payDate.getTime());
				payDate.add(Calendar.MONTH, this.getPaymentFrequency().termNum);
			}

		}

		//最終利息（端数）
		if (payDate.getTime().getTime() > this.getMaturityDate().getTime()) {
			payDate.setTime(this.getMaturityDate());
			c = new Cashflow();
			cashflows.add(c);
			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			if (FixOrFloat.Fixed.toString().equals(l.getFixOrFloat())) {
				c.setCashflowType(CashflowType.FixedInterest.toString());
			} else {
				c.setCashflowType(CashflowType.FloatInterest.toString());
			}
			//リセットの設定
			c.setResets(this.generateResets(l, lastFixedDate, fixedDate, this.getMaturityDate(), c.getCashflowPK()));

			c.setPayDate(this.getMaturityDate());
			if(Position.Pay.toString().equals(l.getPayOrRec())) {
				c.setPrincipalAmount(lastPrincipalAmount);

			} else {
				c.setPrincipalAmount(lastPrincipalAmount * -1);
			}
			//利息額の計算
			c.setPayAmount(this.getInterestAmount(lastInerestPayDate, cashflows));
			cashflows.add(c);

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
		c.setPayDate(this.getMaturityDate());

		l.setCashflows(cashflows);

	}

	private List<Reset> generateResets(Leg leg, Calendar lastFixedDate, Calendar fixedDate, Date payDate, CashflowPK cashflowPk) {

		int resetnumber = 0;
		List<Reset> resets = new ArrayList<Reset>();
		if(FixOrFloat.Fixed.equals(leg.getFixOrFloat())
				|| fixedDate.getTime().getTime() > payDate.getTime()) {
			Reset r = new Reset();
			r.setResetPK(new ResetPK(cashflowPk, resetnumber));
			r.setStartDate(lastFixedDate.getTime());
			r.setEndDate(payDate);
			if (this.getFixOrFloat() == FixOrFloat.Fixed) {
				r.setContractRate(this.getRate());
				lastFixedDate.setTime(payDate);
			} else {
				r.setContractRate(0.0);
				r.setRateFixDate(fixedDate.getTime());
			}

			r.setSpread(0.0);
			resets.add(r);
		} else {
			while(fixedDate.getTime().getTime() <= payDate.getTime()) {
				Reset r = new Reset();
				r.setResetPK(new ResetPK(cashflowPk, resetnumber));
				r.setStartDate(lastFixedDate.getTime());
				r.setEndDate(fixedDate.getTime());
				if (this.getFixOrFloat() == FixOrFloat.Fixed) {
					r.setContractRate(this.getRate());
				} else {
					r.setContractRate(0.0);
				}
				r.setSpread(0.0);
				r.setRateFixDate(fixedDate.getTime());

				resets.add(r);

				lastFixedDate.setTime(fixedDate.getTime());
				fixedDate.add(Calendar.MONTH, this.getRateIndex().termNum);
				++resetnumber;
			}
		}
		return resets;
	}

	private int getInterestAmount(Date lastInerestPayDate, List<Cashflow> cashflows) {

		double interestAmount = 0.0;
		int count = 0;
		Cashflow wkCfl = cashflows.get(cashflows.size() - ++count);
		while (wkCfl.getPayDate().getTime() > lastInerestPayDate.getTime()) {

			for(Reset r : wkCfl.getResets()) {
				long diffDays = (r.getEndDate().getTime() - r.getStartDate().getTime()) / ( 24 * 60 * 60 * 1000 );
				interestAmount += ((double)wkCfl.getPrincipalAmount() * r.getContractRate() * (double)diffDays / 365.0) * -1;
			}
			wkCfl = cashflows.get(cashflows.size() - ++count);
		}
		return (int)interestAmount;
	}

}