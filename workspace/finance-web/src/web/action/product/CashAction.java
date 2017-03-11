package web.action.product;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ModelDriven;

import product.model.Cash;
import product.service.ProductService;
import product.types.AmortType;
import product.types.FixOrFloat;
import product.types.LoanOrDeposit;
import product.types.RateIndex;
import product.types.Term;
import web.common.CommonConstant;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "cash-view", type="tiles")
})
public class CashAction extends AbstractAction implements ModelDriven<Cash>{

    public int tradeid;
    public List<String> currencyList = CommonConstant.CURRENCY_LIST;
    private Cash cash;

    public String execute() throws Exception {
    	if(tradeid == 0) {

    	} else {
    		cash.initialize(tradeid);
    	}
        return "success";
    }

    @Action("/cash/regist")
    public String regist() throws Exception {

    	ProductService ps = ProductService.getInstance();
    	ps.save(this.cash);
        return "success";
    }

    @Action("/cash/generate-cashflow")
    public String generateCashflow() throws Exception {

    	this.cash.generateCashflows();
    	return "success";
    }
	@Override
	public Cash getModel() {
		// TODO 自動生成されたメソッド・スタブ
		if(this.cash == null) {
			initializeModel();
		}
		return cash;
	}

	private void initializeModel() {
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
