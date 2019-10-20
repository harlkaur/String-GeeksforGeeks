import java.util.Arrays;

public class CasespecificSortingofStrings {

	public static void main(String[] args) {
		String str = "defRTSersUXI";
		System.out.println(caseSort(str));
	}

	public static String caseSort(String str) {
		String result = "";
		String lower = "";
		String upper = "";
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch.isUpperCase(ch)) {
				upper += ch;
			} else {
				lower += ch;
			}
		}
		char[] lowerchar = lower.toCharArray();
		char[] upperchar = upper.toCharArray();
		Arrays.sort(lowerchar);
		Arrays.sort(upperchar);

		int l = 0;
		int u = 0;
		for (int i = 0; i < str.length(); i++) {
			Character res = str.charAt(i);
			if(res.isUpperCase(res)) {
				result += upperchar[u];
				u++;
			}else {
				result += lowerchar[l];
				l++;
			}
		}
		return result;
	}
}
