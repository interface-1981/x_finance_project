package finance.product.model.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import finance.common.types.CashflowType;
import finance.common.types.Position;
import finance.common.types.ProductType;
import finance.product.entity.Cashflow;
import finance.product.entity.Leg;
import finance.product.model.FX;

@Component
@Scope("prototype")
public class FXImpl extends ProductImpl implements FX{

	public FXImpl() {
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

	public Date getEffectiveDate(){
		return super.getTrade().getExpiryDate();
	}
	public void setEffectiveDate(Date effectiveDate){
		super.getTrade().setExpiryDate(effectiveDate);
		super.getTrade().setStartDate(effectiveDate);
		super.getTrade().setMaturityDate(effectiveDate);

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
	public void generateCashflows() {
		List<Leg> legs = super.getTrade().getLegs();
		Leg l = legs.get(0);
		List<Cashflow> cashflows = new ArrayList<Cashflow>();
		Cashflow c = new Cashflow();

		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), 0));
		c.setCashflowType(CashflowType.Principal.toString());
		c.setPayAmount(l.getPrincipalAmount());
		c.setPayDate(this.getEffectiveDate());
		cashflows.add(c);
		l.setCashflows(cashflows);

		c = new Cashflow();

		l = legs.get(1);
		cashflows = new ArrayList<Cashflow>();
		c = new Cashflow();

		c.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), 0));
		c.setCashflowType(CashflowType.Principal.toString());
		c.setPayAmount(l.getPrincipalAmount());
		c.setPayDate(this.getEffectiveDate());


		cashflows.add(c);
		l.setCashflows(cashflows);


	}


}
