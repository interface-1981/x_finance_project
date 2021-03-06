package finance.product.model.impl;

import finance.common.CommonUtil;
import finance.common.types.ProductType;
import finance.common.types.Term;
import finance.product.entity.Cashflow;
import finance.product.entity.Cashflow.CashflowPK;
import finance.product.entity.Leg;
import finance.product.entity.Reset;
import finance.product.entity.Reset.ResetPK;
import finance.product.entity.Trade;
import finance.product.model.Product;

public abstract class ProductImpl implements Product{

	private Trade trade;
	private ProductType productType;

	public ProductImpl() {
		super();
		this.trade = new Trade();
	}

	public void setTradeID(int tradeID) {

		int legCount = 0;
		int cflCount = 0;
		int rstCount = 0;
		this.trade.setTradePK(new Trade.TradePK(tradeID, 0));
		for(Leg l : this.trade.getLegs()) {

			l.setLegPK(new Leg.LegPK(this.trade.getTradePK(),legCount));

			if(l.getCashflows() != null) {

				for(Cashflow c : l.getCashflows()) {

					c.setCashflowPK(new CashflowPK(l.getLegPK(), cflCount));

					if(c.getResets() != null) {
						for(Reset r : c.getResets()) {
							r.setResetPK(new ResetPK(c.getCashflowPK(), rstCount));
							++rstCount;
						}
					}
					++cflCount;
				}
			}
			++legCount;
		}
	}

	public int getTradeID() {
		if (trade.getTradePK() == null) {
			return 0;

		}
		return trade.getTradePK().getTradeID();
	}
	public ProductImpl(Trade trade) {
		super();
		this.trade = trade;
	}

	public ProductType getProductType() {
		return productType;
	}

	protected void setProductType(ProductType productType) {
		this.productType = productType;
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

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public abstract  void generateCashflows();

	public boolean existsCashflow() {

		if (this.trade.getLegs().get(0).getCashflows() != null
				&& this.trade.getLegs().get(0).getCashflows().size() > 0) {
			return true;
		}
		return false;
	}

	public Term getTerm(String termStr) {

		return CommonUtil.getTerm(termStr);
	}


}
