
public class BinaryString {

	public static void main(String[] args) {
		String str = "1111";
		System.out.println(binarySubstring(1,str));
	}

	public static int binarySubstring(int a, String str) {
		int one = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				one++;
			}
		}
		return one*(one-1)/2;
	}
}
