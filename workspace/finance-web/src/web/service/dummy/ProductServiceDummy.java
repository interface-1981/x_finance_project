package web.service.dummy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import finance.product.dto.TradeSummery;
import finance.product.dto.TradeSummeryFilter;
import finance.product.entity.Trade;
import finance.product.model.FX;
import finance.product.model.Product;
import finance.product.service.ProductService;

@Component
public class ProductServiceDummy implements ProductService{

	private static List<Product> productList = new ArrayList<Product>();
	@Override
	public List<TradeSummery> getTradeSummery(TradeSummeryFilter arg0) {

		List<TradeSummery> results = new ArrayList<TradeSummery>();
			TradeSummery ts;
			for(Product p : productList) {

				Trade t = p.getTrade();
				ts = new TradeSummery();
				ts.setTradeID(t.getTradePK().getTradeID());
				ts.setProduct(t.getProduct());
				ts.setCounterpartyID(t.getCounterpartyID());
				ts.setStartDate(t.getStartDate());
				ts.setMaturityDate(t.getMaturityDate());
				ts.setExpiryDate(t.getExpiryDate());
				ts.setStatus(t.getStatus());
				ts.setAuditTimeStamp(t.getAuditTimeStamp());

				if(t.getLegs().size() > 0) {

					ts.setLeg1Currency(t.getLegs().get(0).getCurrency());
					ts.setLeg1PrincipalAmount(t.getLegs().get(0).getPrincipalAmount());
					ts.setLeg1FixOrFloat(t.getLegs().get(0).getFixOrFloat());
					ts.setLeg1PayOrRec(t.getLegs().get(0).getPayOrRec());

				}

				if(t.getLegs().size() > 1) {

					ts.setLeg2Currency(t.getLegs().get(1).getCurrency());
					ts.setLeg2PrincipalAmount(t.getLegs().get(1).getPrincipalAmount());
					ts.setLeg2FixOrFloat(t.getLegs().get(1).getFixOrFloat());
					ts.setLeg2PayOrRec(t.getLegs().get(1).getPayOrRec());

				}

				results.add(ts);

			}
			return results;
	}

	@Override
	public void load(Product arg0, int arg1) {
		// TODO 自動生成されたメソッド・スタブ
		if (productList.size() >= arg1) {

			Product copyFrom = productList.get(arg1 - 1);

			arg0.setTradeID(copyFrom.getTradeID());
			arg0.setCounterpartyID(copyFrom.getCounterpartyID());
			arg0.setStatus(copyFrom.getStatus());

			if(arg0 instanceof  FX && copyFrom instanceof FX) {
				FX fxDest = (FX)arg0;
				FX fxSrc = (FX)copyFrom;

				fxDest.setBuyAmount(fxSrc.getBuyAmount());
				fxDest.setBuyCurrency(fxSrc.getBuyCurrency());
				fxDest.setSellAmount(fxSrc.getSellAmount());
				fxDest.setSellCurrency(fxSrc.getSellCurrency());
				fxDest.setEffectiveDate(fxSrc.getEffectiveDate());

			}
		}

	}

	@Override
	public void save(Product arg0) {
		// TODO 自動生成されたメソッド・スタブ
		if (arg0.getTradeID() > 0) {
			productList.set(arg0.getTradeID() - 1, arg0);
		} else {
			arg0.setTradeID(productList.size() + 1);
			productList.add(arg0);
		}
	}


}
