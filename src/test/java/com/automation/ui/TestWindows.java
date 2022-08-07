package com.automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindows {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/WindowsTest.html");
        
        driver.findElement(By.linkText("Try it")).click();
        
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("Testing");
                
		Thread.sleep(Long.valueOf("3000"));
	
		driver.quit();
	}
	   
}
