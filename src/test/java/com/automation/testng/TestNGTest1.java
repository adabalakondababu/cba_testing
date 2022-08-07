package com.automation.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest1 {

	@BeforeMethod
	public static void testMethod()
	{
		System.out.println("Before Method in Test1");
	}
	
	@AfterMethod
	public static void testMethod2()
	{
		System.out.println("After Method in Test1");
	}
	
	@Test
	public static void practiceTest() throws InterruptedException {
	  System.out.println("Test NG Test1");
	}
	
	@Test
	public static void practiceTest2() {

	  System.out.println("Test NG Test1 - Additional Test");
	}
}
