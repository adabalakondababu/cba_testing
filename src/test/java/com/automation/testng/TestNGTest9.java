package com.automation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;             		


public class TestNGTest9 {				


//Test to pass as to verify listeners.		
@Test		
public void TestToPass()				
{		
	System.out.println("This method to test Pass");					
    Assert.assertTrue(true);						
}	

@Test		
public void TestToPass2()				
{		
	System.out.println("This method to test Pass");					
    Assert.assertTrue(true);						
}

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    SoftAssert softAssert= new SoftAssert();
    softAssert.assertTrue(false);	
    System.out.println("This method to test fail2");	
    softAssert.assertTrue(false);
    System.out.println("This method to test fail3");   
    softAssert.assertAll();
}	

@Test		
public void TestToFail2()				
{		
    System.out.println("This method to test failure1");					
    Assert.assertTrue(false);	
    System.out.println("This method to test failure2");	
    Assert.assertTrue(false);
    System.out.println("This method to test failure3");   
}
}
