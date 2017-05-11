package finance.product.model;

import finance.common.types.ProductType;
import finance.product.entity.Trade;

public interface Product {

	public Trade getTrade();
	public void setTrade(Trade trade);

	public void setTradeID(int tradeID);
	public int getTradeID();
	public ProductType getProductType();

	public String getCounterpartyID();
	public void setCounterpartyID(String counterpartyID);

	public String getStatus();
	public void setStatus(String status);

	public void generateCashflows();

	public boolean existsCashflow();

}
