package week2.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("babu");
		set.add("gopi");
		set.add("sarath");
		set.add("gayatri");
		set.add("gayatri");
		System.out.println(set.size());
		System.out.println(set.remove("gopi"));
		System.out.println(set.size());
		System.out.println(set.contains("gopi"));
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		for (String eachSet : set) {
			System.out.println(eachSet);
		}

	}

}







