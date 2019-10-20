
public class stringsarerotations {

	public static void main(String[] args) {
		String s = "fsbcnuvqhffbsaqxwp";
		String x  = "wpfsbcnuvqhffbsaqx";
		System.out.println(areRotations(s, x));
	}

	public static boolean areRotations(String s, String x) {
		if (s.length() != x.length()) {
			return false;
		}
		if(s.length() <= 2 && s.equalsIgnoreCase(x)) {
			return true;
		}
		s = s + s;
		return (s.indexOf(x)) >= 0 ? true: false;
	}
}
