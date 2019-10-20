import java.util.Scanner;

public class LongestCommonPrefixinAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			String[] str = new String[no];
			for (int i = 0; i < str.length; i++) {
				str[i] = sc.next();
			}
			longestCommonPrefix(str);
			System.out.println();
		}

	}

	private static void longestCommonPrefix(String[] str) {
		int n = str.length;
		if(n == 1) {
			System.out.println(str[0]);
			return;
		}
		int minLength = str[0].length();
		String minValue = str[0];
		String value = "";
		String initial = str[0];
		for (int i = 1; i < n; i++) {
			value = findMinLenght(minLength, initial, str[i]);
			initial = value;
		}
		if (value.length() < minValue.length()) {
			minValue = value;
		}
		if(value.length() == 0) {
			minValue = "-1";
		}
		System.out.println(minValue);
	}

	private static String findMinLenght(int minLength, String first, String str) {
		// compare string character by character
		int count = 0;
		for (int i = 0, j = 0; i < str.length() && j < first.length(); i++, j++) {
			if (str.charAt(i) == first.charAt(j)) {
				count++;
			} else {
				break;
			}
		}
		return str.substring(0, count);
	}

}
