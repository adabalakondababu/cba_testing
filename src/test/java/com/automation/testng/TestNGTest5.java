package com.automation.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest5 {
	
	
	@BeforeTest
	public static void testMethod11()
	{
		System.out.println("Before Test in Test5");
	}
	
	@AfterTest
	public static void testMethod22()
	{
		System.out.println("After Test in Test5");
	}
	
	@BeforeMethod
	public static void testMethod()
	{
		System.out.println("Before Method in Test5");
	}
	
	@AfterMethod
	public static void testMethod2()
	{
		System.out.println("After Method in Test5");
	}

	@Test
	public static void practiceTest() {

	  System.out.println("Test NG Test5");
	}
}
