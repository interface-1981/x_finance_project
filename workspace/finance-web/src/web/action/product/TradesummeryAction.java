package web.action.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import finance.product.dto.TradeSummery;
import finance.product.dto.TradeSummeryFilter;
import finance.product.service.ProductService;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "trade-summery-view", type="tiles")
})
public class TradesummeryAction extends AbstractAction {

	@Autowired
	private ProductService productService;
    public List<TradeSummery> list = new ArrayList<TradeSummery>();
    public TradeSummeryFilter filter = new TradeSummeryFilter();

    @Action("/trade/summery")
    public String execute() throws Exception {
    	filter.setStartDateTo(new Date());
    	filter.setExpiryDateFrom(new Date());

        return "success";
    }

    @Action("/trade/summery/search")
    public String search() throws Exception {

    	this.list = productService.getTradeSummery(filter);
        return "success";
    }

    public String getUrl(String product, String tradeID) {

    	return "/finance-web/" + product.toLowerCase() + "?tradeid=" + tradeID;
    }

}
