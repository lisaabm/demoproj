package com.automation.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.actions.WebActionHelpers;
import com.automation.datahandler.PropertyDataHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationBase {
	public static WebDriver driver;
	WebActionHelpers webactionhelpers = new WebActionHelpers();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();
    
	/**
	 * Method to Launch the Browser.
	 * @param browserName
	 * @return
	 * @throws Exception
	 */
	public WebDriver launchBrowser(String browserName, String filePath) throws Exception {
		switch (browserName) {
		case "chrome":
			launchChromeBrowser();
			break;

		case "firefox":
			launchFirefoxBrowser();
			break;

		default:
			System.out.println("CHECKBROWSER");
			break;
		}
		return driver;
	}
    
	/**
	 * Method to Initialize Chrome Driver.
	 * @return
	 * @throws Exception
	 */
	public WebDriver launchChromeBrowser() throws Exception {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Properties allProp = propertydatahandler.readPropertiesFile("restaurant.properties");
			webactionhelpers.launchURL(driver, allProp.getProperty("url"));
			return driver;			
		} catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	/**
	 * Method to Initialize FireFox Driver.
	 * @return
	 * @throws Exception
	 */
	public WebDriver launchFirefoxBrowser() throws Exception {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Properties allProp = propertydatahandler.readPropertiesFile("restaurant.properties");
			webactionhelpers.launchURL(driver, allProp.getProperty("url"));
			return driver;
		}catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
    /**
     * 
     * @return
     */
	public static WebDriver getDriver() {
		return driver;
	}


}
