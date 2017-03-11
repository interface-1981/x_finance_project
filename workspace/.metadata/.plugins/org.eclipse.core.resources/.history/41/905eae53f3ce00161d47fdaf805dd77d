package product;

import java.util.Iterator;

import product.entity.Leg;
import product.entity.Trade;

public abstract class Product {

	private Trade trade;
	private ProductType productType;

	protected  enum ProductType {
	Cash,
	FX
	}

	public void setTradeID(int tradeID) {

		int legCount = 0;
		this.trade.setTradePK(new Trade.TradePK(tradeID, 0));
		for(Iterator<Leg> iterator = this.trade.getLegs().iterator(); iterator.hasNext(); ) {
			Leg l = iterator.next();
			l.setLegPK(new Leg.LegPK(this.trade.getTradePK(),legCount));
			++legCount;
		}
	}
	public int getTradeID() {
		if (trade.getTradePK() == null) {
			return 0;

		}
		return trade.getTradePK().getTradeID();
	}
	public Product(Trade trade) {
		super();
		this.trade = trade;
	}

	public ProductType getProductType() {
		return productType;
	}

	protected void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Product() {
		super();
		this.trade = new Trade();
	}
	public String getCounterpartyID(){
		return this.getTrade().getCounterpartyID();
	}

	public void setCounterpartyID(String counterpartyID){
		this.getTrade().setCounterpartyID(counterpartyID);
	}

	public String getStatus(){
		return this.getTrade().getStatus();
	}

	public void setStatus(String status){
		this.getTrade().setStatus(status);
	}

	Trade getTrade() {
		return trade;
	}

	void setTrade(Trade trade) {
		this.trade = trade;
	}
	abstract void generateCashflows();

}
