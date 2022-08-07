package com.automation.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGTest2 {

	@BeforeSuite
	public static void testMethod()
	{
		System.out.println("Before Suite in Test2");
	}
	
	@AfterSuite
	public static void testMethod2()
	{
		System.out.println("After Suite in Test2");
	}
	
	@Test
	public static void practiceTest() {

	  System.out.println("Test NG Test2");
	}
	
	
}
