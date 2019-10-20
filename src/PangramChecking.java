
public class PangramChecking {

	public static void main(String[] args) {
		String str = "Bawds jog, flick quartz, vex nymph";
		System.out.println(checkPanagram(str));
	}

	public static boolean checkPanagram(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 64 && s.charAt(i) < 91) {
				arr[s.charAt(i) - 65]++;
			} else if (s.charAt(i) > 96 && s.charAt(i) < 123) {
				arr[s.charAt(i) - 97]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0)
				return false;
		}
		return true;
	}
}
