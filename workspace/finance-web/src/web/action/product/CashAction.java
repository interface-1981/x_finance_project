package web.action.product;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

import finance.product.model.Cash;
import finance.product.service.ProductService;
import finance.product.types.AmortType;
import finance.product.types.FixOrFloat;
import finance.product.types.LoanOrDeposit;
import finance.product.types.RateIndex;
import finance.product.types.Term;
import web.common.CommonConstant;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "cash-view", type="tiles")
})
public class CashAction extends AbstractAction implements ModelDriven<Cash>{

	@Autowired
	private ProductService productService;
    public int tradeid;
    public List<String> currencyList = CommonConstant.CURRENCY_LIST;
    private Cash cash;

    public String execute() throws Exception {
    	if(tradeid == 0) {

    	} else {
    		productService.initialize(this.getModel(), tradeid);
    	}
        return "success";
    }

    @Action("/cash/regist")
    public String regist() throws Exception {


    	productService.save(this.cash);
        return "success";
    }

    @Action("/cash/generate-cashflow")
    public String generateCashflow() throws Exception {

    	this.cash.generateCashflows();
    	return "success";
    }
	@Override
	public Cash getModel() {
		if(this.cash == null) {
			this.createModel();
		}
		return cash;
	}

	private void createModel() {
		this.cash = new Cash();
		this.cash.setFixOrFloat(FixOrFloat.Fixed);
		this.cash.setLoanOrDeposit(LoanOrDeposit.Loan);
		this.cash.setAmortType(AmortType.None);
	}
	public RateIndex[] getRateIndexList() {
		return RateIndex.values();
	}
	public AmortType[] getAmortTypeList() {
		return AmortType.values();
	}
	public LoanOrDeposit[] getLoanOrDepositList() {
		return LoanOrDeposit.values();
	}
	public FixOrFloat[] getFixOrFloatList() {
		return FixOrFloat.values();
	}
	public Term[] getTermList() {
		return Term.values();
	}

}
