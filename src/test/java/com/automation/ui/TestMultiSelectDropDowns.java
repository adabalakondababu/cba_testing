package com.automation.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMultiSelectDropDowns {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    Thread.sleep(Long.valueOf("4000"));
	    driver.manage().window().maximize();
	    Thread.sleep(Long.valueOf("4000"));
        driver.get("file:///C:/Users/konda/Desktop/HTML_Files/DropdownsMultiple.html");
        Thread.sleep(Long.valueOf("4000"));
       
        WebElement cars = driver.findElement(By.id("cars"));
        Select carsSelect = new Select(cars);
        
        carsSelect.selectByIndex(0);
        Thread.sleep(Long.valueOf("2000"));
        carsSelect.selectByValue("mercedes");
        Thread.sleep(Long.valueOf("2000"));
        carsSelect.selectByVisibleText("Audi Car");      
		Thread.sleep(Long.valueOf("2000"));
		carsSelect.deselectByIndex(0);
        Thread.sleep(Long.valueOf("2000"));
        carsSelect.deselectByValue("mercedes");
        Thread.sleep(Long.valueOf("2000"));
        carsSelect.deselectByVisibleText("Audi Car");      
		Thread.sleep(Long.valueOf("2000"));
		carsSelect.selectByIndex(1);
		Thread.sleep(Long.valueOf("2000"));
	
		driver.close();
	}
	   
}
