package web.action.market;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

import finance.market.model.YieldCurve;
import web.action.AbstractAction;

@Namespace("/")
@ParentPackage(value="json-default")
@Results({
@Result(name="success", type="json", params={"root", "graphData"})
})
public class YieldCurveGraphAction extends AbstractAction implements ModelDriven<YieldCurve>{

	@Autowired
    private YieldCurve yieldCurve;

	public double[][] graphData;

	@Action("/yieldcurvegraph")
    public String execute() throws Exception {

		this.yieldCurve.interpolate();
		this.setGraphData(this.yieldCurve.getCalcurateGridData());

        return "success";
    }


	@Override
	public YieldCurve getModel() {
		return this.yieldCurve;
	}


	private void setGraphData(Map<Integer, Double> data) {

		int index = 0;
		this.graphData = new double[data.size()][2];
		for (Map.Entry<Integer, Double> entry : data.entrySet()) {
		    // termを取得
			this.graphData[index][0] = entry.getKey();
		    // rateを取得
			this.graphData[index][1] = entry.getValue();
			++index;
		}
	}
}
