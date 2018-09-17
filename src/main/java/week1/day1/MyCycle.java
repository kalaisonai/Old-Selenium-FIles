package week1.day1;

public class MyCycle {

	public static void main(String[] args) {
		
		// Goal : To call Bicycle call and its method, variable
		// Syntax: How to call another class
		// ClassName reference = new ClassName();
		
		//ClassName.methodName();
		Bicycle.applyBrake();
		
		
		Bicycle cycle = new Bicycle();
		
		// Syntax: How to call its method?
		// reference.methodName or variable
		String cycleColor = cycle.findColor("daughter");
		System.out.println(cycleColor);
		
		short numberOfWheels = cycle.numberOfWheels;
		System.out.println(numberOfWheels);

	}

}
