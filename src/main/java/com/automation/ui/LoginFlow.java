package com.automation.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFlow {
    
    public WebElement loginID(WebDriver driver)
    {
    	return driver.findElement(By.id("login"));
    }
    
    public WebElement worriorUsername(WebDriver driver)
    {
    	return driver.findElement(By.id("worrior_username"));
    }
    
    public WebElement worriorPassword(WebDriver driver)
    {
    	return driver.findElement(By.id("worrior_pwd"));
    }
    
    public WebElement worriorLoginID(WebDriver driver)
    {
    	return driver.findElement(By.id("warrior"));
    }
    
    public void clickElement(WebElement element, WebDriver driver) throws InterruptedException
    {
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    	element.click();
    	Thread.sleep(2000);
    }
    
    public void enterText(WebElement element, WebDriver driver, String text)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    	element.sendKeys(text);
    }
}
