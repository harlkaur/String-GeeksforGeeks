import java.util.HashMap;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(nonrepeatingCharacter(s));
	}

	static char nonrepeatingCharacter(String str) {
		boolean flag = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char ch = '$';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}else
				map.put(ch, map.get(ch)+1);
		}
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(map.get(c)==1) {
				flag = true;
				ch = c;
				return ch;
			}
		}
		
		if(!flag)
				ch = '$';
//		
//		Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<Character, Integer> entry = iter.next();
//			if(entry.getValue() == 1) {
//				ch = (Character)entry.getKey();
//				return ch;
//			}
//		}
		
//		Set<Entry<Character, Integer>> entry = map.entrySet();
//		for(Entry<Character, Integer> e: entry) {
//			if(e.getValue() == 1) {
//				ch = e.getKey();
//				return ch;
//			}
//		}
		return ch;
	}
}
