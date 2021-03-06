package web.action.product;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

import finance.product.model.FX;
import finance.product.service.ProductService;
import web.action.AbstractAction;
import web.common.CommonConstant;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "fx-view", type="tiles")
})
public class FxAction extends AbstractAction implements ModelDriven<FX>{

	@Autowired
	private ProductService productService;
	@Autowired
    private FX fx;
    public int tradeid;
    public List<String> currencyList = CommonConstant.CURRENCY_LIST;

    public String execute() throws Exception {
    	if(tradeid == 0) {

    		Calendar effectiveDate = Calendar.getInstance();
    		effectiveDate.setTime(new Date());
    		effectiveDate.add(Calendar.DATE, 2);
    		fx.setEffectiveDate(effectiveDate.getTime());
    	} else {
    		productService.load(this.getModel(), tradeid);
    	}
        return "success";
    }

    @Action("/fx/regist")
    public String regist() throws Exception {

    	productService.save(this.getModel());
        return "success";
    }

	@Override
	public FX getModel() {
		return this.fx;
	}


}
