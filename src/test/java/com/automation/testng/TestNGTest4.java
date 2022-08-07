package com.automation.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGTest4 {
	
	
	@BeforeGroups(groups = "Konda")
	public static void testMethod()
	{
		System.out.println("Before Groups in Test4");
	}
	
	@AfterGroups(groups = "Konda")
	public static void testMethod2()
	{
		System.out.println("After Groups in Test4");
	}

	@Test
	public static void practiceTest() {

	  System.out.println("Test NG Test4");
	}
}
