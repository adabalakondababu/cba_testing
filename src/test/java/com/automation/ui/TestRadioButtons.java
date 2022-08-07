package com.automation.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRadioButtons {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/RadioButtons.html");
        
//        driver.findElement(By.xpath("//input[@value='Mango']")).click();
//        driver.findElement(By.xpath("//input[@value='Tomato']")).click();
        
        List<WebElement> group1 = driver.findElements(By.xpath("//input[@name='group1']"));
        group1.get(2).click();        
        group1.get(1).click();
        List<WebElement> group2 = driver.findElements(By.xpath("//input[@name='group2']"));
        
        group2.get(1).click();
        
        
        for(int i=0; i< group1.size();i++)
        {
        	System.out.println(group1.get(i).getAttribute("value")+" is selected:: "+ group1.get(i).isSelected());
        }
        
        
       driver.findElement(By.cssSelector("input[value='Banana']")).click();
       driver.findElement(By.cssSelector("input[value='Tomato']")).click();
       
       System.out.println("");
       
       for(int i=0; i< group1.size();i++)
       {
       	System.out.println(group1.get(i).getAttribute("value")+" is selected:: "+ group1.get(i).isSelected());
       }
        
		Thread.sleep(Long.valueOf("3000"));
	
		driver.close();
	}
	   
}
