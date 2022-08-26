package com.qa.keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import com.qa.base.TestBase;
import com.qa.util.PropUtility;
import com.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword extends TestBase {
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
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOADTIMEOUT));
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

	public static void enterText(By element, String text) {
		driver.findElement(element).sendKeys(text);

	}

	public static class filledUserRegistration {

		public static void userFirstname(By element, String text) {
			driver.findElement(element).sendKeys(text);
		}

		public static void userLastname(By element, String text) {
			driver.findElement(element).sendKeys(text);

		}

		public static void selectGender(By xpath) {
			driver.findElement(xpath).click();

		}

		public static void enterDay(By xpath) {
			Select day = new Select(driver.findElement(xpath));
			day.selectByValue("22");

		}

		public static void enterMonth(By xpath) {
			Select day = new Select(driver.findElement(xpath));
			day.selectByValue("2");

		}

		public static void enterYear(By xpath) {
			Select day = new Select(driver.findElement(xpath));
			day.selectByValue("1990");
		}

		public static void enterEmail(By xpath, String text) {
			driver.findElement(xpath).sendKeys(text);

		}

		public static void enterCompanyName(By xpath, String text) {
			driver.findElement(xpath).sendKeys(text);
		}

		public static void clickOnNewsletterCheckbox(By xpath) {
			driver.findElement(xpath).click();
		}

		public static void enterPassword(By xpath, String text) {
			driver.findElement(xpath).sendKeys(text);
		}

		public static void confirmPassword(By xpath, String text) {
			driver.findElement(xpath).sendKeys(text);

		}

		public static void clickOnRegisterbtn(By xpath) {
			driver.findElement(xpath).click();

		}
	}
}