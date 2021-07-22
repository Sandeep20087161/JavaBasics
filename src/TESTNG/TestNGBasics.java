package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {

	
	@BeforeClass
	public void m1() {
		System.out.println("Inside Before class");
	}
	@BeforeMethod
	public void m2() {
		System.out.println("Inside Before method");
		
	}
	
	@Test
	public void m3() {
		System.out.println("Inside test");
		
	}
	
	@AfterMethod
	public void m4() {
		System.out.println("Inside After Method");
		
	}
	
	
	@AfterClass
	public void m5() {
		System.out.println("Inside After class");
		
	}
	
}
