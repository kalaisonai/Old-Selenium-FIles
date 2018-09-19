package week1.day3;

public class Atlas implements Bicycle, ElectricCycles{

	@Override
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Brake applied in Atlas");
	}

	@Override
	public String findColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public void ringBell() {
		// TODO Auto-generated method stub
		System.out.println("Ring Bell");
	}

	@Override
	public void chargeBattery() {
		// TODO Auto-generated method stub

	}


}
