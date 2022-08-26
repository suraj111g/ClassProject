package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.keywords.Keyword;

public class LoginPage {
	@FindBy(css = ".page-title h1")
	public WebElement loginPageTitle;
	
	@FindBy(id = "Email")
	public WebElement emailTxtbx;
	
	@FindBy(id = "Password")
	public WebElement passwordTxtbx;
	
	@FindBy(css ="button[class*=login]")
	public WebElement loginBtn;
	
	//public WebElement logOutBtn;
	{
		//Keyword.switchToFrame(0);
		//logOutBtn=Keyword.driver.findElement(By.cssSelector(".ico-logout"));
	}

	public LoginPage() {	
		PageFactory.initElements(Keyword.driver, this);
	}
	public boolean checkLoginPageTitle() {
		String title=loginPageTitle.getText();
		boolean result=title.contains("Sign In");
		return result;
	}	
	public void login() {
		HomePage homepage=new HomePage();
		homepage.clickOnLogin();
		Keyword.sendKeys(emailTxtbx, "username");
		Keyword.sendKeys(passwordTxtbx, "password");
		loginBtn.click();
	}
	public void clickOnLogout(){
		//logOutBtn.click();
	}
}
