package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import product.entity.Cashflow;
import product.entity.Leg;
import product.entity.Trade;

public class Sample2 {

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
			trade.setTradePK(new Trade.TradePK(633468, 0));
			trade.setProduct("FX");
			trade.setAuditTimeStamp(new Date());
			trade.setCounterpartyID("9999999");
			trade.setStartDate(df.parse("2016/12/24"));
			trade.setMaturityDate(df.parse("2016/12/24"));
			trade.setExpiryDate(df.parse("2016/12/24"));
			trade.setStatus("Live");

			List<Leg> legs = new ArrayList<Leg>();

			//Leg1
			Leg leg = new Leg();
			leg.setLegPK(new Leg.LegPK(trade.getTradePK(), 0));
			leg.setCurrency("JPY");
			leg.setPayOrRec("Pay");
			leg.setPrincipalAmount(1000000);

			legs.add(leg);

			//Leg2
			leg = new Leg();
			leg.setLegPK(new Leg.LegPK(trade.getTradePK(), 1));
			leg.setCurrency("USD");
			leg.setPayOrRec("Rec");
			leg.setPrincipalAmount(923600);
			legs.add(leg);

			// set cashflow
			for(Iterator<Leg> iterator = legs.iterator(); iterator.hasNext(); ) {
				Leg l = iterator.next();
				List<Cashflow> cashflows = new ArrayList<Cashflow>();
				Cashflow cashflow = new Cashflow();
				cashflow.setCashflowPK(new Cashflow.CashflowPK(l.getLegPK(), 0));
				cashflow.setCashflowType("Principal");
				cashflow.setPayDate(trade.getExpiryDate());
				if(l.getPayOrRec().equals("Pay")){
					cashflow.setPayAmount(l.getPrincipalAmount());
					cashflow.setPrincipalAmount(l.getPrincipalAmount());

				}else {
					cashflow.setPayAmount(l.getPrincipalAmount() * -1);
					cashflow.setPrincipalAmount(l.getPrincipalAmount() * -1);
				}
				cashflows.add(cashflow);
				l.setCashflows(cashflows);

			}

			//add legs
			trade.setLegs(legs);

			session.saveOrUpdate((Trade)trade);    // 挿入実行
			trans.commit();
			session.close();
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
