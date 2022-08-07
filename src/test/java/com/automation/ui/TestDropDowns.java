package com.automation.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDowns {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/Dropdowns.html");
        
       
        WebElement cars = driver.findElement(By.id("cars"));
        Select carsSelect = new Select(cars);
        
        carsSelect.selectByIndex(1);
        Thread.sleep(Long.valueOf("3000"));
        carsSelect.selectByValue("mercedes");
        Thread.sleep(Long.valueOf("3000"));
        carsSelect.selectByVisibleText("Audi Car");
        
        
		Thread.sleep(Long.valueOf("3000"));
	
		driver.close();
	}
	   
}
