package sample;

import java.text.ParseException;
import java.util.List;

import product.dto.TradeSummery;
import product.dto.TradeSummeryFilter;
import product.model.FX;
import service.ProductService;


public class Sample6 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		FX fx = new FX();
		System.out.println(fx.getBuyCurrency());
		ProductService service = new ProductService();
		service.initialize(fx, 23);
		List<TradeSummery> list = service.getTradeSummery(new TradeSummeryFilter());
		for(TradeSummery t : list) {

			System.out.println(t.getTradeID());
			System.out.println(t.getLeg1Currency());

		}
	}

}