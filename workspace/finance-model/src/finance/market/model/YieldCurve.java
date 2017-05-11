package finance.market.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import finance.market.entity.MarketDataValue;

public interface YieldCurve {

	public  enum InterpolateMethod {
		Liner,
		Spline,
		Hermite,
		Neville
	}

	public void interpolate();
	public List<MarketDataValue> getInputGridPointList();
	public void setInputGridPointList(List<MarketDataValue> inputGridPointList);
	public Map<Integer, Double> getCalcurateGridData();
	public InterpolateMethod getInterpolateMethod();
	public void setInterpolateMethod(InterpolateMethod interpolateMethod);
	public Date getAsOfDate();
	public void setAsOfDate(Date asOfDate);
	public String getMarketID();
	public void setMarketID(String marketID);

}
