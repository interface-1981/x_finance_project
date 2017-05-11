package finance.market.service;

import java.util.Date;

import finance.market.model.YieldCurve;

public interface MarketDataService {

	public void saveYieldCurve(YieldCurve yieldCurve);
	public void loadYieldCurve(YieldCurve yieldCurve, Date asOfDate, String marketID);


}
