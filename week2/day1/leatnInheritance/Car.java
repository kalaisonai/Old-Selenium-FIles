package leatnInheritance;

public class Car extends Vehicle {

	public void callVehicles() {
		applyBrake();
		soundHorn();
		System.out.println("callVehicles");
	}
}
