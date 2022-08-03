package com.prestocafe.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.prestocafe.actions.WebActionHelpers;
import com.prestocafe.datahandler.PropertyDataHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationBase {
	public static WebDriver driver;
	WebActionHelpers webAction = new WebActionHelpers();
	PropertyDataHandler prop = new PropertyDataHandler();
    
	/**
	 * 
	 * @param browserName
	 * @return
	 * @throws Exception
	 */
	public WebDriver launchBrowser(String browserName) throws Exception {
		switch (browserName) {
		case "chrome":
			launchChromeBrowser();
			break;

		case "firefox":
			// launchFirefoxBrowser();
			break;

		default:
			System.out.println("CHECKBROWSER");
			break;
		}
		return driver;
	}
    
	/**
	 * Method to launch Chrome
	 * @return
	 * @throws Exception
	 */
	private WebDriver launchChromeBrowser() throws Exception {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Properties allProp = prop.readPropertiesFile("config.properties");
			webAction.navigateToURL(driver, allProp.getProperty("url"));
			return driver;
			
		} catch (Exception e) {
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
