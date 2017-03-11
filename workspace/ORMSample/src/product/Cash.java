package product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import product.entity.Cashflow;
import product.entity.Leg;
import product.types.FixOrFloat;
import product.types.Position;
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
	public void setFixOrFloat(FixOrFloat FixOrFloatTypes){
		super.getTrade().getLegs().get(0).setFixOrFloat(FixOrFloatTypes.toString());
	}

	public Position getPosition(){

		if(Position.Pay.toString().equals(super.getTrade().getLegs().get(0).getPayOrRec())){
			return Position.Pay;
		} else if(Position.Rec.toString().equals(super.getTrade().getLegs().get(0).getPayOrRec())){
			return Position.Rec;
		} else {
			return null;
		}
	}
	public void setPosition(Position position){
		super.getTrade().getLegs().get(0).setPayOrRec(position.toString());
	}

	public double getRate() {
		return super.getTrade().getLegs().get(0).getRate();
	}
	public void setRate(double rate) {
		super.getTrade().getLegs().get(0).setRate(rate);
	}

	public Term getInterestFrequency() {

		if(Term._1m.termStr.equals(super.getTrade().getLegs().get(0).getInterestFrequency())){
			return Term._1m;
		}else if(Term._3m.termStr.equals(super.getTrade().getLegs().get(0).getInterestFrequency())){
			return Term._3m;
		}else if(Term._6m.termStr.equals(super.getTrade().getLegs().get(0).getInterestFrequency())){
			return Term._6m;
		}else if(Term._12m.termStr.equals(super.getTrade().getLegs().get(0).getInterestFrequency())){
			return Term._12m;
		}else {
			return null;
		}
	}
	public void setInterestFrequency(Term term){
		super.getTrade().getLegs().get(0).setInterestFrequency(term.termStr);
	}

	@Override
	void generateCashflows() {
		int cflNumber = 0;
		List<Leg> legs = super.getTrade().getLegs();
		Leg l = legs.get(0);
		List<Cashflow> cashflows = new ArrayList<Cashflow>();
		Cashflow c = new Cashflow();
		//初回CFL
		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
		c.setCashflowType(Cashflow.CashflowTypes.Principal.toString());

		if(this.getPosition() == Position.Pay) {
			c.setPayAmount(l.getPrincipalAmount());
			c.setPrincipalAmount(l.getPrincipalAmount());

		} else {
			c.setPayAmount(l.getPrincipalAmount() * -1);
			c.setPrincipalAmount(l.getPrincipalAmount() * -1);
		}
		c.setPayDate(this.getStartDate());

		cashflows.add(c);

		//利息CFL
		Calendar payDate = Calendar.getInstance();
		payDate.setTime(this.getStartDate());
		Calendar lastPayDate = payDate;

		payDate.add(Calendar.MONTH, this.getInterestFrequency().termNum);
		lastPayDate = Calendar.getInstance();
		lastPayDate.setTime(this.getStartDate());
		while (payDate.getTime().getTime() <= this.getMaturityDate().getTime()) {
			c = new Cashflow();
			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			c.setCashflowType(Cashflow.CashflowTypes.FixedInterest.toString());
			c.setPayDate(payDate.getTime());
			if(this.getPosition() == Position.Pay) {
				c.setPrincipalAmount(l.getPrincipalAmount());

			} else {
				c.setPrincipalAmount(l.getPrincipalAmount() * -1);
			}
			c.setPayAmount((int)((double)this.getPrincipalAmount() * this.getRate() * (double)this.getInterestFrequency().termNum * 30.0 / 365.0));
			cashflows.add(c);

			if (payDate.getTime().getTime() == this.getMaturityDate().getTime()) {
				break;
			}
			lastPayDate = Calendar.getInstance();
			lastPayDate.setTime(payDate.getTime());
			payDate.add(Calendar.MONTH, this.getInterestFrequency().termNum);
		}

		//最終利息（端数）
		if (payDate.getTime().getTime() > this.getMaturityDate().getTime()) {
			payDate.setTime(this.getMaturityDate());
			c = new Cashflow();
			long diffDays = (payDate.getTime().getTime() - lastPayDate.getTime().getTime()) / ( 24 * 60 * 60 * 1000 );
			c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
			c.setCashflowType(Cashflow.CashflowTypes.FixedInterest.toString());
			c.setPayDate(this.getMaturityDate());
			if(this.getPosition() == Position.Pay) {
				c.setPrincipalAmount(l.getPrincipalAmount());

			} else {
				c.setPrincipalAmount(l.getPrincipalAmount() * -1);
			}
			c.setPayAmount((int)((double)this.getPrincipalAmount() * this.getRate() * (double)diffDays / 365.0));
			cashflows.add(c);

		}
		//最終CFL
		c = new Cashflow();
		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), cflNumber++));
		c.setCashflowType(Cashflow.CashflowTypes.Principal.toString());

		if(this.getPosition() == Position.Pay) {
			c.setPayAmount(l.getPrincipalAmount() * -1);
		} else {
			c.setPayAmount(l.getPrincipalAmount());
		}
		c.setPayDate(this.getMaturityDate());
		cashflows.add(c);
		l.setCashflows(cashflows);

	}


}
