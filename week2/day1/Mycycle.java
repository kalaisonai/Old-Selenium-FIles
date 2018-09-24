package week2.day1;

public class Mycycle {

	public static void main(String[] args) {
		Bicycle cycle = new Bicycle();
		/*String color = cycle.findColor("SON");
		System.out.println(color);*/
		int color = cycle.findCyclesByColor("white");
		System.out.println(color);
	}

}
