package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import finance.product.entity.Trade;

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//System.out.println("test");

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		try {

			Configuration config = new Configuration();
			config = config.configure();
			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();
			Transaction trans = session.beginTransaction();

			// 新しいレコードの作成
			Trade trade = new Trade();

			trade.setTradePK(new Trade.TradePK(553456, 0));
			trade.setProduct("Cash");
			trade.setAuditTimeStamp(new Date());
			trade.setCounterpartyID("ABCD");
			trade.setStartDate(df.parse("2008/02/16"));
			trade.setMaturityDate(df.parse("2018/02/16"));
			trade.setExpiryDate(df.parse("2018/02/16"));
			trade.setStatus("Live");

			session.save(trade);    // 挿入実行
			trans.commit();
			session.close();
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
