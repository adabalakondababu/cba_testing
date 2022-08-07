package com.automation.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAttributeValues {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/Checkboxes.html");
        
       
        List<WebElement> group1 = driver.findElements(By.xpath("//input[@name='group1']"));        
        
        System.out.println("");
        for(int i=0; i< group1.size();i++)
        {
        	System.out.println("Type:: "+group1.get(i).getAttribute("type"));
        	System.out.println("Name:: "+group1.get(i).getAttribute("name"));
        	System.out.println("Value:: "+group1.get(i).getAttribute("value"));
        	System.out.println("");
        }
        
        
		Thread.sleep(Long.valueOf("3000"));
	
		driver.close();
	}
	   
}
