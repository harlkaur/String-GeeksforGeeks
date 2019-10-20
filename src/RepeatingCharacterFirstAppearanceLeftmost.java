import java.util.HashMap;

public class RepeatingCharacterFirstAppearanceLeftmost {

	public static void main(String[] args) {
		String str = "geeks";
		int index = repeatedCharacter(str);
		if (index != -1)
			System.out.println(str.charAt(index));
		else
			System.out.println("-1");
	}

	static int repeatedCharacter(String str) {
		int index = -1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else
				map.put(ch[i], map.get(ch[i]) + 1);
		}

		for (int k = 0; k < str.length(); k++) {
			char c = str.charAt(k);
			if (map.get(c) > 1) {
				index = k;
				break;
			}
		}
		return index;
	}
}
