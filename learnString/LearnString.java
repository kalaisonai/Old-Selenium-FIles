package learnString;

public class LearnString {

	public static void main(String[] args) {
		// Reverse string
		String a = "testleaf";
		char[] charArray = a.toCharArray();
		for (int i = charArray.length -1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		/*for (int i = charArray.length; i > 0; i--) {
			System.out.print(a.charAt(i-1));
		}*/
		
		
		/*// In between chars
		String a = "hi pls find the in between characters";
		String substring = 
				a.substring(a.indexOf("s")+1, a.lastIndexOf("s"));
		System.out.println(substring.trim());
		System.out.println(substring.length());
	*/
		
		
		/*// find occurrences of characters
		String str = "Amazon India";
		char[] array = str.toLowerCase().toCharArray();
		int count = 0;
		for (char c : array) {
			if(c == 'a' || c == 'a') {
				count++;
			}
		}
		System.out.println(count);*/
		
		/*String text ="Test";
		text = "Leaf";
		String t = new String("Test");
		String t1 = new String("Test");
		String text1 ="Test";*/
		//String data = text.concat(" Leaf");
		//System.out.println(data); 
        /*System.out.println(System.identityHashCode(text));
        System.out.println(System.identityHashCode(text1));
        System.out.println(System.identityHashCode(t));
        System.out.println(System.identityHashCode(t1));*/
		/*System.out.println(text);
	    System.out.println(System.identityHashCode(text));*/
	}
	
	

}
