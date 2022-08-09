package com.prestocafe.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.actions.WebActionHelpers;
import com.automation.base.AutomationBase;
import com.automation.datahandler.PropertyDataHandler;
import com.prestocafe.pages.LoginPage;

public class LoginTest extends AutomationBase {
	static WebDriver driver;
	LoginPage loginpage;
	ClickActionHelpers clickactionhelpers;
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	WebActionHelpers webactionhelpers= new WebActionHelpers();
	SoftAssert soft = new SoftAssert();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();
	
	@Parameters("browserType")
	@BeforeTest
	public void initializeDriverandLaunchUrl(@Optional("browserType") String browserType) throws Exception {
		
		driver = launchBrowser("browserType");
		Properties allProp = propertydatahandler.readPropertiesFile("restaurant.properties");
		webactionhelpers.launchURL(driver, allProp.getProperty("url"));
	
		//webactionhelpers.launchURL(driver, "https://qalegend.com/restaurant/login");
		loginpage = new LoginPage(driver);
	}
	
	@Test(priority=0)
	public void checkElementsDisplayed() throws Exception {
		
		soft=new SoftAssert();
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.usrname));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.pwd));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.loginbtn));
		soft.assertAll();
	}
	
	@Test(priority=1)
	public void validLogin() throws Exception {
		webactionhelpers = new WebActionHelpers();
		loginpage.typeUsername("admin");
		loginpage.typePassword("password");
		loginpage.clickLogin();
		soft.assertEquals(webactionhelpers.getSiteTitle(driver), loginpage.title);
	}
	
	@AfterTest
	public void closeWindow() throws Exception {
		webactionhelpers.closeCurrentWindow(driver);
	}

}
