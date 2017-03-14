package web.action.product;

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
import web.common.CommonConstant;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "fx-view", type="tiles")
})
public class FxAction extends AbstractAction implements ModelDriven<FX>{

	@Autowired
	private ProductService productService;
    public int tradeid;
    public List<String> currencyList = CommonConstant.CURRENCY_LIST;
    private FX fx = new FX();

    public String execute() throws Exception {
    	if(tradeid == 0) {

    	} else {
    		productService.initialize(this.getModel(), tradeid);
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
		if(this.fx == null) {
			this.createModel();
		}
		return fx;
	}

	private void createModel() {
		this.fx = new FX();
	}
}
