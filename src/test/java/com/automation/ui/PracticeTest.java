package com.automation.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {
	
	
	    @Test
		public static void practiceTest() throws NumberFormatException, InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    //j.executeScript ("document.getElementById('email').value='KondababuA'");
	   	//WebElement username =  driver.findElement(By.id("email"));
		WebElement username =  driver.findElement(By.name("email"));
		WebElement password =  driver.findElement(By.id("pass"));
		//WebElement login =  driver.findElement(By.name("login"));
		List<WebElement> logins =  driver.findElements(By.name("login"));
		System.out.println("Logins Size:: "+logins.size());
		//username.sendKeys("KondababuA");
		//password.sendKeys("Password");
				
		j.executeScript("arguments[0].value='pte2408202001@gmail.com'", username);
		j.executeScript("arguments[0].value='P@ssw0rd1'", password);
		//login.click();
		logins.get(0).click();
		Thread.sleep(Long.valueOf("20000"));
		driver.close();
	}
}
