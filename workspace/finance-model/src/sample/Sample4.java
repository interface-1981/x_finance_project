package sample;

import java.util.Date;

import product.model.FX;
import service.ProductService;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		for(int i = 0; i < 2000; i++) {

			FX fx = new FX();
			//fx.setTradeID("121213");

			fx.setCounterpartyID("ABC_BANK");
			fx.setBuyCurrency("USD");
			fx.setBuyAmount(200000);
			fx.setSellCurrency("AUD");
			fx.setSellAmount(180000);
			fx.setEffectiveDate(new Date());
			fx.setStatus("Live");

			ProductService service = new ProductService();
			service.save(fx);
		}
	}

}