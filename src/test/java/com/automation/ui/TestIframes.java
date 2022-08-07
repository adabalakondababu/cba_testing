package com.automation.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://www.foxtel.com.au/pay-my-bill.html");
        
        driver.findElement(By.id("accountNumber")).sendKeys("12345678");
        
        driver.findElement(By.id("amount")).sendKeys("5");
        
        driver.findElement(By.id("nameOnCard")).sendKeys("Test");
        
        
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("iframe-payment-url");
        
        //driver.switchTo().frame(driver.findElement(By.id("iframe-payment-url")));
        
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        
        driver.findElement(By.id("cardnumber")).sendKeys("5123456789012346");
        
        driver.findElement(By.id("expirydatemonth")).sendKeys("05");
        
        driver.findElement(By.id("expirydateyear")).sendKeys("25");
        
        driver.findElement(By.id("cvc")).sendKeys("123");
        
        //driver.switchTo().parentFrame();
        
        driver.switchTo().defaultContent();
        
        //Point point = new Point(0, 0);
        
        //driver.manage().window().setPosition(point);
        
        WebElement element = driver.findElement(By.tagName("header"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element); 
        
        driver.findElement(By.id("accountNumber")).clear();
        
        driver.findElement(By.id("accountNumber")).sendKeys("98765401");
        
        Thread.sleep(3000);
	
		driver.close();
	}
	   
}
