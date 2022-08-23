package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.keywords.Keyword;

public class RegistrationPage {
	@FindBy(css = ".page-title h1")
	public WebElement registrationPageTitle;

	public RegistrationPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public boolean registrationPageTitleIsDisplayed() {
		return registrationPageTitle.isDisplayed();
	}
}
