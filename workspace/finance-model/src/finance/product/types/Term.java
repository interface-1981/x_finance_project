package finance.product.types;

public  enum Term {
	_1m("_1m", 1, "1m"),
	_3m("_3m", 3, "3m"),
	_6m("_6m", 6, "6m"),
	_12m("_12m", 12, "12m");

	public String termKey;
	public int termNum;
	public String termStr;
	private Term(String termKey, int termNum, String termStr) {

		this.termKey = termKey;
		this.termNum = termNum;
		this.termStr = termStr;
	}
}