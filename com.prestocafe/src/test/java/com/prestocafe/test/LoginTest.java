package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.prestocafe.actions.ClickActionHelpers;
import com.prestocafe.actions.SendKeysActionHelpers;
import com.prestocafe.actions.ValidationActionHelpers;
import com.prestocafe.actions.WebActionHelpers;
import com.prestocafe.base.AutomationBase;
import com.prestocafe.pages.LoginPage;

public class LoginTest extends AutomationBase {
	WebDriver driver;
	LoginPage loginpage;
	ClickActionHelpers clickactionhelpers;
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	WebActionHelpers webactionhelpers;
	SoftAssert soft = new SoftAssert();;
	
	@BeforeTest
	@Parameters("browserType")
	public void initializeDriverandLaunchUrl("browserType") {
		
		driver = launchBrowser("browserType");
		webactionhelpers.launchURL(driver, "https://qalegend.com/restaurant/login");
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
