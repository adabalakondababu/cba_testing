package com.automation.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationAndCheckLeaderScoreBoardTest {
	BrowserSetUp browserSetUp = new BrowserSetUp();
	WebDriver driver;

	@Test
	public void registrationAndCheckLeaderScoreBoardTest() throws InterruptedException {
		driver = browserSetUp.setUp();
		String username = browserSetUp.generateRandomString();
		UserRegistration userRegistration = new UserRegistration();
		driver.get("https://responsivefight.herokuapp.com/");
		driver.manage().window().maximize();
		userRegistration.registrationID(driver).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration.username(driver)));
		userRegistration.username(driver).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration.password(driver)));
		userRegistration.password(driver).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration.repeatPassword(driver)));
		userRegistration.repeatPassword(driver).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration.signUp(driver)));
		userRegistration.signUp(driver).click();
		
		
		LoginFlow loginFlow = new LoginFlow();
		wait.until(ExpectedConditions.elementToBeClickable(loginFlow.worriorUsername(driver)));
		loginFlow.enterText(loginFlow.worriorUsername(driver), driver, username);
		loginFlow.enterText(loginFlow.worriorPassword(driver), driver, username);
		loginFlow.clickElement(loginFlow.worriorLoginID(driver), driver);

		GameChallenge gameChallenge = new GameChallenge();
		gameChallenge.clickElement(gameChallenge.startID(driver), driver);
		gameChallenge.clickElement(gameChallenge.enterAtYourOwnRisk(driver), driver);
		gameChallenge.clickElement(gameChallenge.startTheGame(driver), driver);
		gameChallenge.clickElement(gameChallenge.question1(driver), driver);
		gameChallenge.clickElement(gameChallenge.continue1(driver), driver);
		gameChallenge.clickElement(gameChallenge.question2(driver), driver);
		gameChallenge.clickElement(gameChallenge.continue2(driver), driver);
		gameChallenge.clickElement(gameChallenge.question3(driver), driver);
		gameChallenge.clickElement(gameChallenge.continue3(driver), driver);
		gameChallenge.clickElement(gameChallenge.question4(driver), driver);
		gameChallenge.clickElement(gameChallenge.continue4(driver), driver);
		driver.get(gameChallenge.leaderBoardURL(driver));
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains(username));
		browserSetUp.tearDown(driver);
	}
}
