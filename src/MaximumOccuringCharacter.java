import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		String str = "output";
		getMaxOccuringChar(str);
	}

	public static void getMaxOccuringChar(String line) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		char[] ch = line.toCharArray();
		int max  = Integer.MIN_VALUE;
		char key = 0;
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(line.charAt(i), 1);
			} else {
				map.put(line.charAt(i), map.get(line.charAt(i)) + 1);
			}
		}

		Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Entry entry = iter.next();
			if((Integer)entry.getValue() > max) {
				max  = (Integer)entry.getValue();
				key = (Character)entry.getKey();
				
			}
		}
		
		System.out.println(key);
	}

}
