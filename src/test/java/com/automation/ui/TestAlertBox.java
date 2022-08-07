package com.automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlertBox {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/AlertBox.html");
        
        driver.findElement(By.xpath("//button")).click();
        
        driver.switchTo().alert();
        
        System.out.println("Text:: "+driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();       
        
		Thread.sleep(Long.valueOf("3000"));
	
		driver.close();
	}
	   
}
