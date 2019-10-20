import java.util.HashMap;

public class Minimumindexedcharacter {

	public static void main(String[] args) {
		String str = "adcffaet";
		String pattern = "xx";
		solution(str, pattern);
	}

	public static void solution(String s1, String s2) {
		boolean flag = false;
		char index = 0;
		int valueIndex ;
		int min = Integer.MAX_VALUE;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if(!map1.containsKey(ch))
				map1.put(ch, i);
		}

		for(int i=0;i<s2.length();i++) {
			if(map1.containsKey(s2.charAt(i))) {
				valueIndex = map1.get(s2.charAt(i));
				flag = true;
				if(valueIndex < min) {
					min = valueIndex;
					index = s2.charAt(i);
				}
			}
		}
		
		if(flag)
			System.out.println(index);
		else
			System.out.println("No character present");
	}
}
