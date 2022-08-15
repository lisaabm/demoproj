package com.prestocafe.test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	HomePage homepage= new HomePage(driver);
	WebActionHelpers webactionhelpers;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();	
	SoftAssert soft = new SoftAssert();
	
	@BeforeTest
	@Parameters("browserType")
	public void initializeDriverandLaunchUrl(String browserType) throws Exception {
		loginpage = new LoginPage(driver);
		
		final String currentDir = System.getProperty("user.dir");
		final String filePath = currentDir + "/src/main/resources/" + "chromedriver.exe";
		driver = launchBrowser(browserType,filePath);
//		Properties allProp = propertydatahandler.readPropertiesFile("restaurant.properties");
//		homepage = loginpage.login(allProp.getProperty("username"), allProp.getProperty("password"));
		homepage = loginpage.login("admin","password");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));		
		
	}
	/**
	 * Method to validate Product button.
	 * @throws Exception
	 */
	@Test(priority =1)
	public void validateProductBtn() throws Exception {
		homepage=new HomePage(driver);
		clickactionhelpers.click(driver, homepage.product);
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, homepage.product));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	/**
	 * Method to validate Stores button.
	 * @throws Exception
	 */
	@Test(priority =2)
	public void validateStoresBtn() throws Exception {
		homepage=new HomePage(driver);
		clickactionhelpers.click(driver, homepage.stores);
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, homepage.stores));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	/**
	 * Method to validate Sales button.
	 * @throws Exception
	 */
	@Test(priority =3)
	public void validateSalesBtn() throws Exception {
		homepage=new HomePage(driver);
		clickactionhelpers.click(driver, homepage.sales);
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, homepage.sales));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
/**
 * Method to validate People button.
 * @throws Exception
 */
	@Test(priority =4)
	public void validatePeopleBtn() throws Exception {
		homepage=new HomePage(driver);
		clickactionhelpers.click(driver, homepage.people);
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, homepage.people));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
