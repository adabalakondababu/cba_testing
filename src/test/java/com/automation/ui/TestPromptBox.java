package com.automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPromptBox {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/PromptBox.html");
        
        driver.findElement(By.xpath("//button")).click();
        
        String name = "Adabala";
        
        Thread.sleep(Long.valueOf("2000"));
        
        driver.switchTo().alert().sendKeys(name);
        
        Thread.sleep(Long.valueOf("3000"));
               
        driver.switchTo().alert().accept();
        
        Thread.sleep(Long.valueOf("2000"));
        
        String alertText = "Hello " + name + "! How are you today?";
        
        System.out.println("Text:: "+driver.switchTo().alert().getText());
        
        Assert.assertEquals(driver.switchTo().alert().getText(),alertText);
        
        Thread.sleep(Long.valueOf("2000"));
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(Long.valueOf("2000"));
        
        driver.findElement(By.xpath("//button")).click();
        
        Thread.sleep(Long.valueOf("2000"));
        
        driver.switchTo().alert().dismiss();
        
        System.out.println("Text:: "+driver.switchTo().alert().getText());
        
        Assert.assertEquals(driver.switchTo().alert().getText(),"User cancelled the prompt.");
            
        driver.switchTo().alert().accept();
        
		Thread.sleep(Long.valueOf("3000"));
	
		driver.quit();
	}
	   
}
