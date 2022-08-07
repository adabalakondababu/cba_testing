package com.automation.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest6 {


	@Test
	@Parameters("myname")
	public static void practiceTest(String myname) throws InterruptedException {
          System.out.println("My Name Value is:: "+myname);
	 
	}
}
