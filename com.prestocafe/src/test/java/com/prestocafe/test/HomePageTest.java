package com.prestocafe.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.actions.WebActionHelpers;
import com.automation.base.AutomationBase;
import com.automation.datahandler.PropertyDataHandler;
import com.prestocafe.pages.HomePage;
import com.prestocafe.pages.LoginPage;

public class HomePageTest extends AutomationBase {
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	WebActionHelpers webactionhelpers;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();	
	
	
	@BeforeTest
	@Parameters("browserType")
	public void initializeDriverandLaunchUrl(@Optional("browserType") String browserType) throws Exception {
		
		driver = launchBrowser("browserType");
		Properties allProp = propertydatahandler.readPropertiesFile("restaurant.properties");
		webactionhelpers.launchURL(driver, allProp.getProperty("url"));
	
		//webactionhelpers.launchURL(driver, "https://qalegend.com/restaurant/login");
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
	}
	
	

	

}
