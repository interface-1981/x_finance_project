package product.types;

public  enum Term {
	_1m(1, "1m"),
	_3m(3, "3m"),
	_6m(6, "6m"),
	_12m(12, "12m");
	public int termNum;
	public String termStr;
	private Term(int termNum, String termStr) {

		this.termNum = termNum;
		this.termStr = termStr;
	}
}