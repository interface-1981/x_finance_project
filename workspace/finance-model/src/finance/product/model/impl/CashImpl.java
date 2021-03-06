package finance.product.model.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import finance.common.types.AmortType;
import finance.common.types.FixOrFloat;
import finance.common.types.LoanOrDeposit;
import finance.common.types.ProductType;
import finance.common.types.RateIndex;
import finance.common.types.Term;
import finance.product.entity.Cashflow;
import finance.product.entity.Leg;
import finance.product.model.Cash;

@Component
@Scope("prototype")
public class CashImpl extends IRProduct implements Cash{

	public CashImpl() {
		super.getTrade().setProduct(ProductType.Cash.toString());
		List<Leg> legs = new ArrayList<Leg>();
		Leg leg = new Leg();
		legs.add(leg);
		super.getTrade().setLegs(legs);
		super.setProductType(ProductType.Cash);
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
		return super.getFixOrFloat(super.getTrade().getLegs().get(0).getFixOrFloat());
	}
	public void setFixOrFloat(FixOrFloat fixOrFloatTypes){
		super.getTrade().getLegs().get(0).setFixOrFloat(fixOrFloatTypes.toString());
	}

	public AmortType getAmortType(){
		return super.getAmortType(super.getTrade().getLegs().get(0).getAmortType());
	}
	public void setAmortType(AmortType amortType){
		super.getTrade().getLegs().get(0).setAmortType(amortType.toString());
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

		return super.getRateIndex(super.getTrade().getLegs().get(0).getRateIndex());
	}
	public void setPaymentFrequency(Term term){
		super.getTrade().getLegs().get(0).setPaymentFrequency(term.termStr);
	}

	public Term getPaymentFrequency() {

		return super.getTerm(super.getTrade().getLegs().get(0).getPaymentFrequency());
	}

	public Term getAmortFrequency() {

		return super.getTerm(super.getTrade().getLegs().get(0).getAmortFrequency());
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

}
