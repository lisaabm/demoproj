package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.actions.WebActionHelpers;
import com.prestocafe.pages.HomePage;
import com.prestocafe.pages.LoginPage;

public class HomePageTest {
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	WebActionHelpers webactionhelpers;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	
	@Test
	public void initializeDriverandLaunchUrl() throws Exception {
		webactionhelpers = new WebActionHelpers();
		driver = webactionhelpers.initializeDriver("chrome");
		webactionhelpers.launchURL(driver, "https://qalegend.com/restaurant/login");
		loginpage = new LoginPage(driver);
		homepage = loginpage.login("admin", "password");
	}
	
//	<parameter name="browserType" value="chrome"></parameter>
//	@Parameters("browserType")
//	public void setup(String browserType) throws AutomationException {
//		driver = launchBrowser(browserType);


	

}
