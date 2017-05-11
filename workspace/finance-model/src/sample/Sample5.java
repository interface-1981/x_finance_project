package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import finance.common.types.AmortType;
import finance.common.types.FixOrFloat;
import finance.common.types.LoanOrDeposit;
import finance.common.types.Term;
import finance.product.model.Cash;
import finance.product.model.impl.CashImpl;
import finance.product.service.ProductService;
import finance.product.service.impl.ProductServiceImpl;

public class Sample5 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

//		for(int i = 0; i < 10; i++) {

			Cash cash = new CashImpl();

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

			ProductService service = new ProductServiceImpl();
			service.save(cash);
//		}
	}

}
