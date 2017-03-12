package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import product.entity.Trade;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//System.out.println("test");

		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		try {

			Configuration config = new Configuration();
			config = config.configure();
			SessionFactory sessionfactory = config.buildSessionFactory();
			Session session = sessionfactory.openSession();

			List<Trade> list = session.createCriteria(Trade.class).list();


			for(Iterator<Trade> iterator = list.iterator(); iterator.hasNext(); ) {
				Trade t = iterator.next();
				System.out.println(t.toString());
			}


		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
