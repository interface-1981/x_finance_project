package finance.common;

public class CommonUtil {

	public static boolean isEmpty(String str) {

		if(str == null || str.equals("")) {
			return true;
		}
		return false;
	}
}
