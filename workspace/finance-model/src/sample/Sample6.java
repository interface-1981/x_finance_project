package sample;

import java.text.ParseException;
import java.util.List;

import finance.product.dto.TradeSummery;
import finance.product.dto.TradeSummeryFilter;
import finance.product.model.FX;
import finance.product.model.impl.FXImpl;
import finance.product.service.ProductService;
import finance.product.service.impl.ProductServiceImpl;


public class Sample6 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		FX fx = new FXImpl();
		System.out.println(fx.getBuyCurrency());
		ProductService service = new ProductServiceImpl();
		service.load(fx, 23);
		List<TradeSummery> list = service.getTradeSummery(new TradeSummeryFilter());
		for(TradeSummery t : list) {

			System.out.println(t.getTradeID());
			System.out.println(t.getLeg1Currency());

		}
	}

}
