package keyWords;

import org.testng.annotations.Test;

public class LearnSuper2 extends LearnSuper {

	@Test
	public  void main2() {
		super.setValue();
	}
	
	public void setValue() {
		System.out.println("70");  
	}

}
