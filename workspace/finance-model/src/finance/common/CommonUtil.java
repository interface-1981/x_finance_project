package finance.common;

import java.util.List;

import finance.common.types.Term;

public class CommonUtil {

	public static boolean isEmpty(String str) {

		if(str == null || str.equals("")) {
			return true;
		}
		return false;
	}

	public static double[] toArray(List<Double> list) {

		double array[] = new double[list.size()];
		for (int i = 0 ; i < list.size(); ++i)  {
			array[i] = list.get(i);
		}
		return array;
	}


	public static Term getTerm(String termStr) {

		if(Term._1m.termStr.equals(termStr)){
			return Term._1m;
		}else if(Term._3m.termStr.equals(termStr)){
			return Term._3m;
		}else if(Term._6m.termStr.equals(termStr)){
			return Term._6m;
		}else if(Term._12m.termStr.equals(termStr)){
			return Term._12m;
		}else if(Term._2y.termStr.equals(termStr)){
			return Term._2y;
		}else if(Term._3y.termStr.equals(termStr)){
			return Term._3y;
		}else if(Term._4y.termStr.equals(termStr)){
			return Term._4y;
		}else if(Term._5y.termStr.equals(termStr)){
			return Term._5y;
		}else if(Term._6y.termStr.equals(termStr)){
			return Term._6y;
		}else if(Term._7y.termStr.equals(termStr)){
			return Term._7y;
		}else if(Term._8y.termStr.equals(termStr)){
			return Term._8y;
		}else if(Term._9y.termStr.equals(termStr)){
			return Term._9y;
		}else if(Term._10y.termStr.equals(termStr)){
			return Term._10y;
		}else if(Term._15y.termStr.equals(termStr)){
			return Term._15y;
		}else if(Term._20y.termStr.equals(termStr)){
			return Term._20y;
		}else if(Term._30y.termStr.equals(termStr)){
			return Term._30y;
		}else if(Term._40y.termStr.equals(termStr)){
			return Term._40y;
		}else if(Term._50y.termStr.equals(termStr)){
			return Term._50y;
		}else if(Term._60y.termStr.equals(termStr)){
			return Term._60y;
		}else {
			return null;
		}
	}
}
