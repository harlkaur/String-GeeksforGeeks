
public class MaximumOccuringCharacterUsingCountArray {

	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String str = "output";
		System.out.println(getMaxOccuringChar(str));
	}

	static char getMaxOccuringChar(String str) {
		// freq[] used as hash table
		int freq[] = new int[26];

		// to store maximum frequency
		int max = -1;

		// to store the maximum occurring character
		char result = 0;

		// length of 'str'
		int len = str.length();

		// get frequency of each character of 'str'
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != ' ') {
				freq[str.charAt(i) - 'a']++;
			}
		}

		// for each character, where character is obtained by
		// (i + 'a') check whether it is the maximum character
		// so far and accodingly update 'result'
		for (int i = 0; i < 26; i++) {
			if (max < freq[i]) {
				max = freq[i];
				result = (char) (i + 'a');
			}
		}

		// maximum occurring character
		return result;
	}
}
