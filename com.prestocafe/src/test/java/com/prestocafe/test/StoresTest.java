package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.JsExecutorActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.UtilityActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.base.AutomationBase;
import com.automation.datahandler.PropertyDataHandler;
import com.prestocafe.pages.HomePage;
import com.prestocafe.pages.LoginPage;
import com.prestocafe.pages.StoresPage;


public class StoresTest extends AutomationBase{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	StoresPage storespage;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	SoftAssert soft = new SoftAssert();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();
	UtilityActionHelpers utilityactionhelpers = new UtilityActionHelpers();
	JsExecutorActionHelpers jsexecutoractionhelpers = new JsExecutorActionHelpers();
	
	@Parameters("browserType")
	@BeforeTest
	public void initializeDriverandLaunchUrl(String browserType) throws Exception {
		
		final String currentDir = System.getProperty("user.dir");
		final String filePath = currentDir + "/src/test/resources/" + "chromedriver.exe";
		driver = launchBrowser(browserType,filePath);
		
    	 loginpage = new LoginPage(driver);
    	 homepage = new HomePage(driver);
    	 storespage = homepage.clickonStoresPage();
   	}
	
	/**
	 * Method to Edit Store Details.
	 */
	@Test
	public void validateEditBtn() {
		
	}
}
