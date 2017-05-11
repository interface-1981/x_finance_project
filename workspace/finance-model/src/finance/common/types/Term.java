package finance.common.types;

public  enum Term {
	_1m("_1m", 1, "1m"),
	_3m("_3m", 3, "3m"),
	_6m("_6m", 6, "6m"),
	_12m("_12m", 12, "12m"),
	_2y("_2y", 24, "2y"),
	_3y("_3y", 36, "3y"),
	_4y("_4y", 48, "4y"),
	_5y("_5y", 60, "5y"),
	_6y("_6y", 72, "6y"),
	_7y("_7y", 84, "7y"),
	_8y("_8y", 96, "8y"),
	_9y("_9y", 108, "9y"),
	_10y("_10y", 120, "10y"),
	_15y("_15y", 180, "15y"),
	_20y("_20y", 240, "20y"),
	_30y("_30y", 360, "30y"),
	_40y("_40y", 480, "40y"),
	_50y("_50y", 600, "50y"),
	_60y("_60y", 720, "60y");

	public String termKey;
	public int termNum;
	public String termStr;
	private Term(String termKey, int termNum, String termStr) {

		this.termKey = termKey;
		this.termNum = termNum;
		this.termStr = termStr;
	}
}