package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import product.model.Cash;
import product.types.AmortType;
import product.types.FixOrFloat;
import product.types.LoanOrDeposit;
import product.types.Term;
import service.ProductService;

public class Sample5 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

//		for(int i = 0; i < 10; i++) {

			Cash cash = new Cash();

			cash.setCounterpartyID("ABC_BANK");
			cash.setCurrency("JPY");
			cash.setPrincipalAmount(500000);
			cash.setFixOrFloat(FixOrFloat.Fixed);
			cash.setLoanOrDeposit(LoanOrDeposit.Loan);
			//cash.setRateIndex(RateIndex.JPTI6M);
			cash.setPaymentFrequency(Term._6m);
			cash.setAmortFrequency(Term._6m);
			cash.setAmortType(AmortType.Amount);
			cash.setAmortAmount(30000);

			cash.setRate(0.123);

			cash.setStartDate(df.parse("2016/12/24"));
			cash.setMaturityDate(df.parse("2020/2/14"));
			cash.setStatus("Live");

			ProductService service = new ProductService();
			service.save(cash);
//		}
	}

}
