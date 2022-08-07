package com.automation.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest3 {
	
	
	@BeforeTest
	public static void testMethod()
	{
		System.out.println("Before Test in Test3");
	}
	
	@AfterTest
	public static void testMethod2()
	{
		System.out.println("After Test in Test3");
	}

	@Test
	public static void practiceTest() {

	  System.out.println("Test NG Test3");
	}
	
	@Test(groups = {"Konda"})
	public static void practiceTest2() {

	  System.out.println("Test NG Test3 - Additional Test");
	}
}
