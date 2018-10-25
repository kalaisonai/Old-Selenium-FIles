package keyWords;

public class ReverseAString {

	public static void main(String[] args) {
		//minimum 3 different ways 
		//which one is longest solution
		//which one is best solution
		//1.number of lines  2.performance 
		String text = "Hello world";
		StringBuffer reverse = new StringBuffer(text).reverse();
		System.out.println(reverse);
		/*for (int i = text.length()-1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}*/ 
		/*char[] ch = text.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}*/
		

	}

}






