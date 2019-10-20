
public class NaivePatternSearch {

	public static void main(String[] args) {
		String text = "liuewahf";
		String pattern = "ahf";
		System.out.println(search(pattern, text));
	}

	static boolean search(String pat, String txt) {
		int text = txt.length();
		int pattern = pat.length();
		for (int i = 0; i <= (text - pattern); i++) {
			for (int j = 0; j < pattern; j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
				if (j == (pattern-1))
					return true;
			}
		}
		return false;
	}

}
