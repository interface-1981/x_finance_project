package web.action.market;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

import finance.market.model.YieldCurve;
import finance.market.model.YieldCurve.InterpolateMethod;
import web.action.AbstractAction;

@Namespace("/")
@ParentPackage("tiles-default")
@Results({
@Result(name = "success", location = "yieldcurve-view", type="tiles")
})
public class YieldCurveAction extends AbstractAction implements ModelDriven<YieldCurve>{

	@Autowired
    private YieldCurve yieldCurve;

	@Action("/yieldcurve")
    public String execute() throws Exception {
		this.yieldCurve.setAsOfDate(new Date());
        return "success";
    }

    @Action("/yieldcurve/regist")
    public String regist() throws Exception {

        return "success";
    }

	@Override
	public YieldCurve getModel() {
		return this.yieldCurve;
	}

	public InterpolateMethod[] getInterpolateMethodList() {
		return InterpolateMethod.values();
	}
}
