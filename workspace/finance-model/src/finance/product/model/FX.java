package finance.product.model;

import java.util.Date;


public interface FX extends Product{


	public Date getEffectiveDate();
	public void setEffectiveDate(Date effectiveDate);

	public String getBuyCurrency();
	public void setBuyCurrency(String currency);

	public int getBuyAmount();
	public void setBuyAmount(int amount);

	public String getSellCurrency();
	public void setSellCurrency(String currency);

	public int getSellAmount();
	public void setSellAmount(int amount);

}
