package com.qa.pagetests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.keywords.Keyword;
import com.qa.keywords.Keyword.filledUserRegistration;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;
import com.qa.util.PropUtility;

public class RegistrationPageTest extends TestBase{
	
	@Test(priority = 0)
	public void clickonRegister() {
		HomePage Homepage = new HomePage();
		RegistrationPage reg=Homepage.clickOnRegister();
		boolean result=reg.registrationPageTitleIsDisplayed();
		Assert.assertTrue(result);
	}
	@Test(priority = 1)
	public void userRegistration(){
	
		PropUtility prop=new PropUtility();
		PropUtility.getEnvDetails("url");
		HomePage Homepage = new HomePage();
		RegistrationPage reg=Homepage.clickOnRegister();
		filledUserRegistration.selectGender(By.xpath(prop.getLocator("Gender_radio")));
		filledUserRegistration.userFirstname(By.xpath(prop.getLocator("first_name")),"Suraj");
		filledUserRegistration.userLastname(By.xpath(prop.getLocator("last_name")),"Gunjal");
		filledUserRegistration.enterDay(By.xpath(prop.getLocator("select_Day")));
		filledUserRegistration.enterMonth(By.xpath(prop.getLocator("select_Month")));
		filledUserRegistration.enterYear(By.xpath(prop.getLocator("select_Year")));
		filledUserRegistration.enterEmail(By.xpath(prop.getLocator("enter_Email")),"Suraj111g@gmail.com");
		filledUserRegistration.enterEmail(By.xpath(prop.getLocator("enter_CompName")),"nopCommerce");
		filledUserRegistration.clickOnNewsletterCheckbox(By.xpath(prop.getLocator("clickOnNewsLetter_checkbox")));
		filledUserRegistration.enterPassword(By.xpath(prop.getLocator("enter_Password")),"Suraj@123");
		filledUserRegistration.confirmPassword(By.xpath(prop.getLocator("confirm_Password")),"Suraj@123");
		filledUserRegistration.clickOnRegisterbtn(By.xpath(prop.getLocator("clickOn_Submitbtn")));
		
	}
}
