package product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import product.entity.Cashflow;
import product.entity.Leg;
import product.types.Position;

public class FX extends Product{

	public FX() {
		super.getTrade().setProduct(ProductType.FX.toString());
		List<Leg> legs = new ArrayList<Leg>();
		Leg leg = new Leg();
		leg.setPayOrRec(Position.Pay.toString());
		legs.add(leg);
		leg = new Leg();
		leg.setPayOrRec(Position.Rec.toString());
		legs.add(leg);
		super.getTrade().setLegs(legs);
		super.setProductType(ProductType.FX);
	}
	public Date getEffecitiveDate(){
		return super.getTrade().getExpiryDate();
	}
	public void setEffecitiveDate(Date effecitiveDate){
		super.getTrade().setExpiryDate(effecitiveDate);
		super.getTrade().setStartDate(effecitiveDate);
		super.getTrade().setMaturityDate(effecitiveDate);

	}
	public String getBuyCurrency(){
		return super.getTrade().getLegs().get(0).getCurrency();
	}
	public void setBuyCurrency(String currency){
		super.getTrade().getLegs().get(0).setCurrency(currency);
	}
	public int getBuyAmount(){
		return super.getTrade().getLegs().get(0).getPrincipalAmount();
	}
	public void setBuyAmount(int amount){
		super.getTrade().getLegs().get(0).setPrincipalAmount(amount);
	}
	public String getSellCurrency(){
		return super.getTrade().getLegs().get(1).getCurrency();
	}
	public void setSellCurrency(String currency){
		super.getTrade().getLegs().get(1).setCurrency(currency);
	}
	public int getSellAmount(){
		return super.getTrade().getLegs().get(1).getPrincipalAmount();
	}
	public void setSellAmount(int amount){
		super.getTrade().getLegs().get(1).setPrincipalAmount(amount);
	}

	@Override
	void generateCashflows() {
		List<Leg> legs = super.getTrade().getLegs();
		Leg l = legs.get(0);
		List<Cashflow> cashflows = new ArrayList<Cashflow>();
		Cashflow c = new Cashflow();

		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), 0));
		c.setCashflowType(Cashflow.CashflowTypes.Principal.toString());
		c.setPayAmount(l.getPrincipalAmount());
		c.setPayDate(this.getEffecitiveDate());
		cashflows.add(c);
		l.setCashflows(cashflows);

		c = new Cashflow();

		l = legs.get(1);
		cashflows = new ArrayList<Cashflow>();
		c = new Cashflow();

		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), 0));
		c.setCashflowType(Cashflow.CashflowTypes.Principal.toString());
		c.setPayAmount(l.getPrincipalAmount());
		c.setPayDate(this.getEffecitiveDate());


		cashflows.add(c);
		l.setCashflows(cashflows);


	}


}