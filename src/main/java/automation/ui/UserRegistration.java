package automation.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRegistration {
    
    public WebElement registrationID(WebDriver driver)
    {
    	return driver.findElement(By.id("rego"));
    }
    
    public WebElement username(WebDriver driver)
    {
    	return driver.findElement(By.id("uname"));
    }
    
    public WebElement password(WebDriver driver)
    {
    	return driver.findElement(By.id("pwd"));
    }
    
    public WebElement repeatPassword(WebDriver driver)
    {
    	return driver.findElement(By.id("psw-repeat"));
    }
    
    public WebElement signUp(WebDriver driver)
    {
    	return driver.findElement(By.id("signupbtn"));
    }
}
