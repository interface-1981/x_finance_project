package web.service.dummy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import finance.product.dto.TradeSummery;
import finance.product.dto.TradeSummeryFilter;
import finance.product.model.Product;
import finance.product.service.ProductService;

@Component
public class ProductServiceDummy implements ProductService{

	@Override
	public List<TradeSummery> getTradeSummery(TradeSummeryFilter arg0) {

		List<TradeSummery> results = new ArrayList<TradeSummery>();
		TradeSummery ts = new TradeSummery();

		ts.setTradeID(1);
		ts.setExpiryDate(new Date());
		ts.setStartDate(new Date());
		ts.setMaturityDate(new Date());
		ts.setAuditTimeStamp(new Date());
		ts.setProduct("FX");

		results.add(ts);
		return results;
	}

	@Override
	public void initialize(Product arg0, int arg1) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void save(Product arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
