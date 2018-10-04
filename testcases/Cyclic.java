package testcases;

import org.testng.annotations.Test;

public class Cyclic {
	@Test(dependsOnMethods = "second")
	public void first() {
		System.out.println("First method");
	}
	@Test(dependsOnMethods = "third")
	public void second() {
		System.out.println("Second method");
	}
	@Test(dependsOnMethods = "first")
	public void third() {
		System.out.println("Third method");
	}

}
