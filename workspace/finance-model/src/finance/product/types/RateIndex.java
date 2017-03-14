package finance.product.types;

public  enum RateIndex {
	JPTI1M(1, "1m", "JPTI", "JPTI1M"),
	JPTI3M(3, "3m", "JPTI", "JPTI3M"),
	JPTI6M(6, "6m", "JPTI", "JPTI6M"),
	JPTI12M(12, "12m", "JPTI", "JPTI12M");

	public int termNum;
	public String termStr;
	public String marketID;
	public String rateIndexID;

	private RateIndex(int termNum, String termStr, String marketID, String rateIndexID) {

		this.termNum = termNum;
		this.termStr = termStr;
		this.marketID = marketID;
		this.rateIndexID = rateIndexID;
	}
}