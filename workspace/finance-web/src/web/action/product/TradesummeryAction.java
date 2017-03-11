package web.action.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import product.dto.TradeSummery;
import product.dto.TradeSummeryFilter;
import product.service.ProductService;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "trade-summery-view", type="tiles")
})
public class TradesummeryAction extends AbstractAction {

    public List<TradeSummery> list = new ArrayList<TradeSummery>();
    public TradeSummeryFilter filter = new TradeSummeryFilter();

    @Action("/trade/summery")
    public String execute() throws Exception {
    	filter.setStartDateTo(new Date());
    	filter.setExpiryDateFrom(new Date());

    	//ProductService ps = ProductService.getInstance();
    	//this.list = ps.getTradeSummery(filter);
        return "success";
    }

    @Action("/trade/summery/search")
    public String search() throws Exception {
    	ProductService ps = ProductService.getInstance();
    	this.list = ps.getTradeSummery(filter);
        return "success";
    }

    public String getUrl(String product, String tradeID) {

    	return "/banking-web/" + product.toLowerCase() + "?tradeid=" + tradeID;
    }

}
