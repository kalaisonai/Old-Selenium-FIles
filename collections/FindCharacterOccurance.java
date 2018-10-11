package utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharacterOccurance {

	public static void main(String[] args) {
		String data = "Testleaf";
		char[] ch = data.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				int count = map.get(c);
					map.put(c, count+1);
			} else {
				    map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
