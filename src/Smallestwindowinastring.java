import java.util.HashMap;

public class Smallestwindowinastring {

	public static void main(String[] args) {
		String str = "zoomlazapzo";
		String text = "oza";
		System.out.println(smallestWindow(str, text));
	}

	public static String smallestWindow(String s, String t) {
		String result = "-1";
		int count  = 0;
		if (s.length() < t.length())
			return result;
		char[] ch = t.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch[i]) {
					int k = j;
					System.out.println(k);
					count++;
					break;
					
				}
			}
		}
		System.out.println("count: " + count);
		if(count == ch.length) {
			// efficient way to trim and find smallest window
			
		}
		return result;
	}
}
