package finance.market.entity;

public class MarketDataValue {

	private String marketDataID;
	private String term;
	private Double rate;
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}


}
