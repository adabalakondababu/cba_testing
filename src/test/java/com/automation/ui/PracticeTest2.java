package com.automation.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest2 {

	WebDriver driver;

	@Test
	public static void practiceTest() throws NumberFormatException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
			
		/*
		 * driver.get("https://www.foxtel.com.au/samsung");
		 * 
		 * Thread.sleep(4000);
		 * 
		 * Set<Cookie> cookie = driver.manage().getCookies();
		 * 
		 * ArrayList<String> ar = new ArrayList<String>();
		 * 
		 * for(int i=0;i<cookie.size();i++) {
		 * 
		 * Cookie ck = (Cookie) cookie.toArray()[i];
		 * 
		 * if(!ck.getName().equalsIgnoreCase("referral")) { ar.add(ck.getName()); } }
		 * 
		 * for(int i=0;i<ar.size();i++) { driver.manage().deleteCookieNamed(ar.get(i));
		 * }
		 * 
		 * Cookie nameCookie = new Cookie("MyName", "Pentayya");
		 * driver.manage().addCookie(nameCookie); cookie = driver.manage().getCookies();
		 * 
		 * for(int i=0;i<cookie.size();i++) {
		 * 
		 * Cookie ck = (Cookie) cookie.toArray()[i];
		 * System.out.println("Cookie "+i+"::"+ck.getName()+": "+ck.getValue());
		 * 
		 * }
		 */
		 
		 

		/*
		 * driver.navigate().to("https://www.google.com.au");
		 * Thread.sleep(Long.valueOf("2000")); driver.get("https://www.guru99.com/");
		 * Thread.sleep(Long.valueOf("2000"));
		 */
		//driver.get("https://www.facebook.com");
		/*
		 * Thread.sleep(Long.valueOf("2000")); driver.navigate().back();
		 * Thread.sleep(Long.valueOf("2000")); driver.navigate().forward();
		 * Thread.sleep(Long.valueOf("2000")); driver.navigate().refresh();
		 * Thread.sleep(Long.valueOf("2000"));
		 */

		// driver.navigate().to("https://www.facebook.com");

		// WebElement username = driver.findElement(By.id("email"));
		// WebElement username = driver.findElement(By.name("email"));
		// WebElement password = driver.findElement(By.id("pass"));
		//WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		// WebElement password = driver.findElement(By.cssSelector("input#pass"));
		// WebElement password = driver.findElement(By.cssSelector("#pass"));
		// WebElement password =
		// driver.findElement(By.cssSelector("input[name='pass']"));
		//WebElement password = driver.findElement(By.cssSelector("._9npi"));

		// WebElement login = driver.findElement(By.name("login"));
//		List<WebElement> logins = driver.findElements(By.name("login"));
//
//		username.sendKeys("pte2408202001@gmail.com");
//		password.sendKeys("P@ssw0rd1");

		// JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("arguments[0].value='pte2408202001@gmail.com'", username);
		// j.executeScript("arguments[0].value='P@ssw0rd1'", password);
		// login.click();

//		System.out.println("Background Color::"+logins.get(0).getCssValue("background-color"));
//		System.out.println("Font Family::"+logins.get(0).getCssValue("font-family"));
//		System.out.println("Font Size::"+logins.get(0).getCssValue("font-size")); 

		/*
		 * Point p = logins.get(0).getLocation(); System.out.println("X Cordinate " +
		 * p.x); System.out.println("X Cordinate " + p.getX());
		 * 
		 * System.out.println("Y Cordinate " + p.y); System.out.println("Y Cordinate " +
		 * p.getY());
		 * 
		 * Dimension d = logins.get(0).getSize(); int width = d.width; int height =
		 * d.height; int heightt = logins.get(0).getSize().height;
		 * System.out.println("Height " + d.getHeight()); System.out.println("Width " +
		 * d.getWidth()); System.out.println("Width " + width);
		 */

//		logins.get(0).click();
//
//		Thread.sleep(Long.valueOf("3000"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
        username.sendKeys("pte2408202001@gmail.com");
  		password.sendKeys("P@ssw0rd1");
  		WebElement login = driver.findElement(By.name("login1"));
  		login.click();
  		Thread.sleep(Long.valueOf("3000"));
		driver.close();
	}

}
