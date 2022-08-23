package com.qa.keywords;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.base.TestBase;
import com.qa.util.PropUtility;
import com.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword extends TestBase{
	/*
	 * @author Kale Jana 
	 */
	public static RemoteWebDriver driver;
	
	public static void initialization(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOADTIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITWAIT));
		driver.manage().deleteAllCookies();
		
		driver.get(PropUtility.getEnvDetails("url"));
	}
	
	public static void sendKeys(WebElement element, String keysTosend) {
		element.sendKeys(keysTosend);
	}
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	public static void switchToFrame(String idORName) {
		driver.switchTo().frame(idORName);
	}
	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

}
