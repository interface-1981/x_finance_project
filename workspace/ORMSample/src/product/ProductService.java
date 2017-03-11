package product;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import product.entity.Trade;

public class ProductService  {

	private static ProductService productService;
	private Session session;

	private ProductService() {

		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory sessionfactory = config.buildSessionFactory();
		this.session = sessionfactory.openSession();
	}

	public static synchronized ProductService getInstance() {

		if (productService == null) {
			productService = new ProductService();
		}
		return productService;
	}

	public synchronized void save(Product product) {

		Transaction trans = session.beginTransaction();
		Trade trade = product.getTrade();
		trade.setAuditTimeStamp(new Date());
		if (product.getTradeID() == 0) {
			@SuppressWarnings({ "rawtypes", "deprecation" })
			NativeQuery query = session.createSQLQuery("select coalesce(max(tradeid),0) from trade");
			@SuppressWarnings("deprecation")
			int id = (int) query.list().get(0);

			++id;
			product.setTradeID(id);
			product.generateCashflows();
			session.save(product.getTrade());
			trans.commit();
		} else {


		}

	}
}
