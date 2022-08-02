package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.prestocafe.actions.ClickActionHelpers;
import com.prestocafe.actions.SendKeysActionHelpers;
import com.prestocafe.actions.ValidationActionHelpers;
import com.prestocafe.actions.WebActionHelpers;
import com.prestocafe.pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginpage;
	ClickActionHelpers clickactionhelpers;
	SendKeysActionHelpers sendkeysactionhelpers;
	ValidationActionHelpers validationactionhelpers;
	WebActionHelpers webactionhelpers;
	SoftAssert soft;
	
	@BeforeTest
	public void initializeDriverandLaunchUrl() {
		webactionhelpers = new WebActionHelpers();
		webactionhelpers.initializeDriver("chrome");
		webactionhelpers.launchURL(driver, "https://qalegend.com/restaurant/login");
	}
	
	@Test(priority=0)
	public void checkElementsDisplayed() throws Exception {
		validationactionhelpers  = new ValidationActionHelpers();
		soft=new SoftAssert();
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.usrname));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.pwd));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, loginpage.loginbtn));
		soft.assertAll();
	}
	
	@Test(priority=1)
	public void validLogin() throws Exception {
		loginpage = new LoginPage();
		loginpage.typeUsername("admin");
		loginpage.typePassword("password");
		loginpage.clickLogin();
	}
	
	@AfterTest
	public void closeWindow() throws Exception {
		webactionhelpers.closeCurrentWindow(driver);
	}

}
