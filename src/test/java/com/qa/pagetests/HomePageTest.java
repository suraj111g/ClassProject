package com.qa.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;

public class HomePageTest extends TestBase {
	/*
	 * 
	 * @author Kale Jana
	 */

	@Test(priority = 0)
	public void verifyHomePageTitle() {
		HomePage Homepage = new HomePage();
		String expTitle = "nopCommerce demo store";
		String actTitle = Homepage.validateHomePageTitle();
		Assert.assertEquals(actTitle, expTitle, "Expected Title didn't match " + actTitle);

	}

	@Test(priority = 1)
	public void verifyPageSource() {
		HomePage Homepage = new HomePage();
		Homepage.validatePageSource();
		boolean act = Homepage.validatePageSource().contains("nopCommercedemo store");
		Assert.assertTrue(act);
	}
		
	@Test(priority = 2)
	public void clickonRegister() {
		HomePage Homepage = new HomePage();
		RegistrationPage reg=Homepage.clickOnRegister();
		boolean result=reg.registrationPageTitleIsDisplayed();
		Assert.assertTrue(result);
	}
}
