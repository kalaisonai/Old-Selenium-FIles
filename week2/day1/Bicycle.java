package week2.day1;

public class Bicycle {

	// Members of the class
	// Methods, Variables

	// Syntax of the variable
	// AccessModifier ReturnType VariableName = Value;
	// AccessModifier: public, private, default, protected
	// Return Type: text -> String (Class)
	// Return Type: number -> byte, short, int, long
	// Return Type: decimal -> float, double
	// Return Type: true/false -> boolean (primitive data type)
	// Return Type: no response -> void (only for methods)
	public String color = "Red";
	public short numberOfWheels = 2;
	private boolean isBellExist = true;

	// Method Signature
	// AccessModifier returnType methodName(input argument){
	// logic
	// }
	static void applyBrake() {
		System.out.println("Brake Applied");
	}

	public String findColor() {
		applyBrake();
		return "red";
	}

	public String findColor(String whose) {
		if (whose.equalsIgnoreCase("daughter")) { // == , equals
			return "pink";
		}else if (whose.equalsIgnoreCase("son")) { // == , equals
			return "blue";
		}else{
			return "red";
		}
	}

	public int findCyclesByColor(String color) {

		int count = 0;
		switch (color.toLowerCase()) {
		case "red":
			count = 4;
			break;
		case "orange":
			count = 3;
			break;
		default:
			count =1;
			break;
		}
		return count-1;
	} 


}










