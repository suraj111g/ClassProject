package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;
import com.qa.keywords.Keyword;

public class HomePage extends TestBase {

	public WebElement registerBtn;
	public WebElement loginBtn;

	
	
	public HomePage() {
		Keyword.switchToFrame(0);
		registerBtn=Keyword.driver.findElement(By.cssSelector(".ico-register"));
		loginBtn=Keyword.driver.findElement(By.cssSelector(".ico-login"));
	}

	public String validateHomePageTitle() {
		return Keyword.driver.getTitle();
	}


	public String validatePageSource() {
		return Keyword.driver.getPageSource();
	}	
	public RegistrationPage clickOnRegister() {
		registerBtn.click();
		return new RegistrationPage();
	}
	public LoginPage clickOnLogin() {
		loginBtn.click();
		return new LoginPage();
	}
}

