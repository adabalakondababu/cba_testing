package automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GameChallenge {
    
    public WebElement startID(WebDriver driver)
    {
    	return driver.findElement(By.id("start"));
    }
    
    public WebElement enterAtYourOwnRisk(WebDriver driver)
    {
    	return driver.findElement(By.id("news"));
    }
    
    public WebElement startTheGame(WebDriver driver)
    {
    	return driver.findElement(By.id("start"));
    }
    
    public WebElement question1(WebDriver driver)
    {
    	return driver.findElement(By.id("answer_1"));
    }
    
    public WebElement continue1(WebDriver driver)
    {
    	return driver.findElement(By.id("continue"));
    }
    
    public WebElement question2(WebDriver driver)
    {
    	return driver.findElement(By.id("answer_2"));
    }
    
    public WebElement continue2(WebDriver driver)
    {
    	return driver.findElement(By.id("continue"));
    }
    
    public WebElement question3(WebDriver driver)
    {
    	return driver.findElement(By.id("answer_2"));
    }
    
    public WebElement continue3(WebDriver driver)
    {
    	return driver.findElement(By.id("continue"));
    }
    
    public WebElement question4(WebDriver driver)
    {
    	return driver.findElement(By.id("answer_2"));
    }
    
    public WebElement continue4(WebDriver driver)
    {
    	return driver.findElement(By.id("continue"));
    }
    
    public String leaderBoardURL(WebDriver driver)
    {
    	return "https://responsivefight.herokuapp.com/leaderboard";
    }
    
    public WebElement leaderBoardField(WebDriver driver) throws InterruptedException
    {
    	Thread.sleep(2000);
    	return driver.findElement(By.xpath("//*[@id=\"showData\"]/table/tbody/tr[2]/td[2]"));
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
