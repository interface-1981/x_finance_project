package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import product.Cash;
import product.ProductService;
import product.types.FixOrFloat;
import product.types.Position;
import product.types.Term;

public class Sample5 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

		for(int i = 0; i < 10000; i++) {

			Cash cash = new Cash();

			cash.setCounterpartyID("ABC_BANK");
			cash.setCurrency("JPY");
			cash.setPrincipalAmount(500000);
			cash.setFixOrFloat(FixOrFloat.Fixed);
			cash.setPosition(Position.Rec);
			cash.setInterestFrequency(Term._1m);
			cash.setRate(0.123);

			cash.setStartDate(df.parse("2016/12/24"));
			cash.setMaturityDate(df.parse("2020/2/14"));
			cash.setStatus("Live");

			ProductService service = ProductService.getInstance();
			service.save(cash);
		}
	}

}
