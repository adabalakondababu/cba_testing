package com.automation.ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest3 {

	@Test
	public static void practiceTest() throws NumberFormatException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(1500, TimeUnit.MILLISECONDS);
		//driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MILLISECONDS);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("document.getElementById('email').value='pte2408202001@gmail.com'");
		j.executeScript("document.getElementById('pass').value='P@ssw0rd1'");

		/*
		 * j.executeScript
		 * ("document.getElementById('email').value='pte2408202001@gmail.com'");
		 * j.executeScript ("document.getElementById('pass').value='P@ssw0rd1'");
		 */

		List<WebElement> logins = driver.findElements(By.name("login"));

		logins.get(0).click();
		Thread.sleep(Long.valueOf("5000"));
		driver.close();
	}
}
