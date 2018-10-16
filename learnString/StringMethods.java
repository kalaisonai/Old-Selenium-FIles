package learnString;

public class StringMethods {

	public static void main(String[] args) {
	
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 
		 * 0) toCharArray() //
		 * 1) length // find the number of characters		  
		 * 2) charAt(index) // The character at the index		  		  
		 * 3) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 4) concat //Concatenate two strings only  2+"Std"
		 * 5) toString() // Convert an existing data type to String
		 * 6) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 7) trim // Removes the white space on begining and End
		 * 8) toLowerCase, toUpperCase // to convert case		  
		 * 9) split('char') -- split(regex, limit) //		 	  
		 * 10)startsWith(s), endsWith(s), contains(s) // match 
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
		 * 
		 * 12) String, StringBuffer(ThreadSafe), StringBuilder(Not ThreadSafe) 
		 */
		
		String text = "TestTLeAfe(12345)";
		System.out.println(text.charAt(4));
		//System.out.println(text.replace("T", "t"));
		//System.out.println(text.concat("a"));
		/*String[] split = text.split("\\(");
		System.out.println(split[1].split("\\)"));*/
//		System.out.println(split[1].split(")"));
		int a =10;
	   // System.out.println(text.trim());
		//System.out.println(text.substring(2, 6));
		//System.out.println(a+t);
		//System.out.println(text.concat(" Welcome"));
		//System.out.println(text.lastIndexOf("e"));
		char[] ch = text.toCharArray();
		for (char c : ch) {
			//System.out.println(c);	
		}
		//System.out.println(text.length());
		
		
		
		
		
		
		
		

	}

}
