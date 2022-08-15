package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.UtilityActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.actions.WebActionHelpers;
import com.automation.base.AutomationBase;
import com.automation.datahandler.PropertyDataHandler;
import com.prestocafe.pages.HomePage;
import com.prestocafe.pages.LoginPage;
import com.prestocafe.pages.ProductPage;

public class ProductTest extends AutomationBase{
	static WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	WebActionHelpers webactionhelpers= new WebActionHelpers();
	SoftAssert soft = new SoftAssert();
	PropertyDataHandler propertydatahandler = new PropertyDataHandler();
	UtilityActionHelpers utilityactionhelpers = new UtilityActionHelpers();
	
	
	@Parameters("browserType")
	@BeforeTest
	public void initializeDriverandLaunchUrl(String browserType) throws Exception {
		
		final String currentDir = System.getProperty("user.dir");
		final String filePath = currentDir + "/src/test/resources/" + "chromedriver.exe";
		driver = launchBrowser(browserType,filePath);
		
    	 loginpage = new LoginPage(driver);
    	 homepage = new HomePage(driver);
    	 productpage = homepage.clickonProductPage();
    	 
	}
	
	public void isElementsDisplayed() throws Exception {
		soft = new SoftAssert();
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, productpage.addprodctbtn));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, productpage.printbtn));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, productpage.downloadcsvbtn));
		soft.assertTrue(validationactionhelpers.isElementVisible(driver, productpage.uploadfilebtn));
	}
	
	public void addProduct() throws Exception {
		clickactionhelpers.click(driver, productpage.addprodctbtn);
		utilityactionhelpers.selectDropDownByIndex(driver,productpage.type, 1);
		sendkeysactionhelpers.enterValue(driver, productpage.code, "P109");
		sendkeysactionhelpers.enterValue(driver, productpage.name, "Cold Coffee");
		utilityactionhelpers.selectDropDownByVisibleText(driver, productpage.category, "Shakes");
		utilityactionhelpers.selectDropDownByValue(driver, productpage.suplier, "Supplier1");
		sendkeysactionhelpers.enterValue(driver, productpage.purchaseprice, "150");
		sendkeysactionhelpers.enterValue(driver, productpage.tax, "5%");
		utilityactionhelpers.selectDropDownByIndex(driver, productpage.taxmethod, 1);
		sendkeysactionhelpers.enterValue(driver, productpage.price, "150");
		clickactionhelpers.click(driver, productpage.submitbtn);
		
	}
	
	
	
	public void editProduct() throws Exception {
		
		utilityactionhelpers.selectDropDownByVisibleText(driver, productpage.type, "Standard");
		clickactionhelpers.click(driver, productpage.submit);
	}
	
	public void uploadCsvFile() {
		final String currentDir = System.getProperty("user.dir");
		
		
	}
}
