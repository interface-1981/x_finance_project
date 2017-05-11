package finance.market.model.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.interpolation.NevilleInterpolator;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import finance.common.CommonUtil;
import finance.common.types.Term;
import finance.market.entity.MarketDataValue;
import finance.market.model.YieldCurve;

@Component
@Scope("prototype")
public class YieldCurveImpl implements YieldCurve{


	private List<MarketDataValue> inputGridPointList;
	private Map<Integer, Double> calcurateGridData;
	private InterpolateMethod interpolateMethod;
	private Date asOfDate;
	private String marketID;

	public 	YieldCurveImpl() {
		this.inputGridPointList = new ArrayList<MarketDataValue>();
		for(int i = 0;  i < Term.values().length; ++i) {
			MarketDataValue md = new MarketDataValue();
			md.setTerm(Term.values()[i].termStr);
			this.inputGridPointList.add(md);
		}
	}
	public void interpolate() {

		List<Double> term = new ArrayList<>();
		List<Double> rate = new ArrayList<>();

		this.calcurateGridData = new HashMap<Integer, Double>();

		double maxTerm = 0.0;
		for (MarketDataValue md : inputGridPointList) {
			if (md.getRate() != null && md.getRate() != 0) {

				term.add((double)CommonUtil.getTerm(md.getTerm()).termNum);
				rate.add(md.getRate());
				maxTerm = (double)CommonUtil.getTerm(md.getTerm()).termNum;

			}
		}
		if (term.size() < 3 && rate.size() < 3) {
			return;
		}
		//SplineInterpolator interpolstor = new SplineInterpolator();
		PolynomialSplineFunction polynomialSplineFunction = null;
		if (getInterpolateMethod() == InterpolateMethod.Liner) {
			LinearInterpolator interpolstor = new LinearInterpolator();
			polynomialSplineFunction = interpolstor.interpolate(CommonUtil.toArray(term), CommonUtil.toArray(rate));

		} else if (getInterpolateMethod() == InterpolateMethod.Spline) {
			SplineInterpolator interpolstor = new SplineInterpolator();
			polynomialSplineFunction = interpolstor.interpolate(CommonUtil.toArray(term), CommonUtil.toArray(rate));

		} else if (getInterpolateMethod() == InterpolateMethod.Hermite) {
			SplineInterpolator interpolstor = new SplineInterpolator();
			polynomialSplineFunction = interpolstor.interpolate(CommonUtil.toArray(term), CommonUtil.toArray(rate));

		} else if (getInterpolateMethod() == InterpolateMethod.Neville) {
			NevilleInterpolator interpolstor = new NevilleInterpolator();
			PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm
				= interpolstor.interpolate(CommonUtil.toArray(term), CommonUtil.toArray(rate));

			//System.out.print(polynomialSplineFunction.value(2.0));
			for (int i = 1; i <= maxTerm; ++i) {

				this.calcurateGridData.put(i, polynomialFunctionLagrangeForm.value(i));

			}
			return;
		}


		//System.out.print(polynomialSplineFunction.value(2.0));
		for (int i = 1; i <= maxTerm; ++i) {

			this.calcurateGridData.put(i, polynomialSplineFunction.value(i));

		}

	}
	public List<MarketDataValue> getInputGridPointList() {
		return inputGridPointList;
	}
	public void setInputGridPointList(List<MarketDataValue> inputGridPointList) {
		this.inputGridPointList = inputGridPointList;
	}
	public Map<Integer, Double> getCalcurateGridData() {
		return calcurateGridData;
	}
	public InterpolateMethod getInterpolateMethod() {
		return interpolateMethod;
	}
	public void setInterpolateMethod(InterpolateMethod interpolateMethod) {
		this.interpolateMethod = interpolateMethod;
	}
	@Override
	public Date getAsOfDate() {
		// TODO 自動生成されたメソッド・スタブ
		return asOfDate;
	}
	@Override
	public void setAsOfDate(Date asOfDate) {
		// TODO 自動生成されたメソッド・スタブ
		this.asOfDate = asOfDate;

	}
	@Override
	public String getMarketID() {
		// TODO 自動生成されたメソッド・スタブ
		return this.marketID;
	}
	@Override
	public void setMarketID(String marketID) {
		// TODO 自動生成されたメソッド・スタブ
		this.marketID = marketID;
	}

}
