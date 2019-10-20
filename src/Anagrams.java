
public class Anagrams {

	public static void main(String[] args) {
		String s1 = "act";
		String s2 = "tac";
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		boolean result = true;
		int[] hash1 = new int[26];
		int[] hash2 = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			hash1[ch - 97]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			hash2[ch - 97]++;
		}
		for (int i = 0, j = 0; i < 26 && j < 26; i++, j++) {
			if (hash1[i] != hash2[j]) {
				return result = false;
			}
		}
		return result;
	}
}
