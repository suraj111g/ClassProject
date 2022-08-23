package com.qa.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import com.qa.keywords.Keyword;

public class TestBase {
	/*
	 * @author Kale Jana
	 */
	
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName) {
		Keyword.initialization(browserName);
		
	}
	@AfterMethod
	public void tearDown() {
		Keyword.driver.quit();
	}
	

	
}
