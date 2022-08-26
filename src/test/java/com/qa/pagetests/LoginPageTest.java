package com.qa.pagetests;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	@Test
	public void verifyLogin() {
		LoginPage loginpage = new LoginPage();
		loginpage.login();
		
	}
}
