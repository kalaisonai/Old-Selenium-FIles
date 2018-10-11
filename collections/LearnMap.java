package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Badu", 1);
		map.put("Gopi", 2);
		map.put("Gayatri", 3);
		map.put("Koushik", 2);
		map.put("Sarath", 1);
		System.out.println(map.size()); 
		System.out.println(map.get("Gayatri")); 
		
		for (Entry<String, Integer> each : map.entrySet()) {
			System.out.println(each.getKey()+"-->"+each.getValue());
		}
	}	
}








