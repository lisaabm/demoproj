package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.prestocafe.actions.ClickActionHelpers;
import com.prestocafe.actions.SendKeysActionHelpers;
import com.prestocafe.actions.ValidationActionHelpers;
import com.prestocafe.actions.WebActionHelpers;
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
	
	

}
