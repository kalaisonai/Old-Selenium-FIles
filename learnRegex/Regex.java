package learnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		
		
		
		String input = "axdxcdgxbxx";
		String a = "";
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if(c == 'x') {
				a+=c; // a = a+c;
			}
		}
		String replace = input.replace("x", "");
		String concat = replace.concat(a);
		System.out.println(concat);
		
		
		
				  
		String actualData = "1234 1234 1234 1234";
		String pat = "[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(actualData);
		System.out.println(matcher.matches());
		
	}
}




