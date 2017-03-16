package finance.product.model;

import java.util.Date;
import java.util.List;

import finance.product.entity.Cashflow;
import finance.product.types.AmortType;
import finance.product.types.FixOrFloat;
import finance.product.types.LoanOrDeposit;
import finance.product.types.RateIndex;
import finance.product.types.Term;

public interface Cash extends Product{

	public LoanOrDeposit getLoanOrDeposit();
	public void setLoanOrDeposit(LoanOrDeposit loanOrDeposit);

	public Date getStartDate();
	public void setStartDate(Date startDate);

	public Date getMaturityDate();
	public void setMaturityDate(Date maturityDate);

	public String getCurrency();
	public void setCurrency(String currency);

	public int getPrincipalAmount();
	public void setPrincipalAmount(int amount);

	public FixOrFloat getFixOrFloat();
	public void setFixOrFloat(FixOrFloat fixOrFloatTypes);

	public AmortType getAmortType();
	public void setAmortType(AmortType amortType);

	public double getRate();
	public void setRate(double rate);

	public double getSpread();
	public void setSpread(double rate);

	public void setRateIndex(RateIndex rateIndex);
	public RateIndex getRateIndex();

	public void setPaymentFrequency(Term term);
	public Term getPaymentFrequency();

	public Term getAmortFrequency();
	public void setAmortFrequency(Term term);

	public double getAmortRate();
	public void setAmortRate(double amortRate);

	public int getAmortAmount();
	public void setAmortAmount(int amortAmount);

	public List<Cashflow> getCashflows();
	public void setCashflows(List<Cashflow> cashflows);
}
