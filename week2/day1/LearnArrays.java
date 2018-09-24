package week2.day1;

public class LearnArrays {

	public static void main(String[] args) {
	  int[] data = {1, 2, 3, 4, 5, 6};
		String[] mobileBrands = new String[5];
		mobileBrands[0] ="Samsung";
		mobileBrands[1] ="Redmi";
		mobileBrands[2] ="Nokia";
		mobileBrands[3] ="Apple";
		//mobileBrands[4] ="Micromax";
		/*for (int i = 0; i < mobileBrands.length; i++) {
        System.out.println(mobileBrands[i]);
	}*/
		/*for (String eachMobile : mobileBrands) {
			System.out.println("The mobile brand name is "+eachMobile);
		}*/
		
		int[] numbers = new int[5];
		numbers[0]= 1234;
		numbers[3]= 12345;
		for (int i = 0; i < numbers.length; i++) {
		  System.out.println(numbers[i]);
		}
	}
}








