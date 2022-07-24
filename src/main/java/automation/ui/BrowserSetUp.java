package automation.ui;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetUp {
	
 WebDriver driver;
 public WebDriver setUp()
 {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		return driver;
 }
 
 public void tearDown(WebDriver driver)
 {
	 this.driver.quit();
 }
 
 public String generateRandomString() {
		String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String asciiLowerCase = asciiUpperCase.toLowerCase();
     String digits = "1234567890";
     String asciiChars = asciiUpperCase + asciiLowerCase + digits;
     int length = 10;
     
     StringBuilder sb = new StringBuilder();
     int i = 0;
     Random rand = new Random();
     while (i < length) {
         sb.append(asciiChars.charAt(rand.nextInt(asciiChars.length())));
         i++;
     }

     System.out.println(String.format("The random string is %s", sb.toString()));
     return sb.toString();
 }
	
}
