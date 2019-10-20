
public class Sumofnumbersinstring {

	public static void main(String[] args) {
		String str = "1abc23";
		System.out.println(findSum(str));
	}

	public static long findSum(String s) {
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}

		}
		return sum+Integer.parseInt(temp);
	}
}
