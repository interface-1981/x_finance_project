package web.service.dummy;

import java.util.Date;

import org.springframework.stereotype.Component;

import finance.market.model.YieldCurve;
import finance.market.service.MarketDataService;

@Component
public class MarketDataServiceDummy implements MarketDataService{

	@Override
	public void loadYieldCurve(YieldCurve arg0, Date arg1, String arg2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void saveYieldCurve(YieldCurve arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
