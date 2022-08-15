package com.prestocafe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.JsExecutorActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.UtilityActionHelpers;
import com.automation.actions.ValidationActionHelpers;
import com.automation.base.AutomationBase;
import com.automation.datahandler.ExcelDataHandler;
import com.automation.datahandler.PropertyDataHandler;
import com.prestocafe.pages.HomePage;
import com.prestocafe.pages.LoginPage;
import com.prestocafe.pages.PeoplePage;

public class PeopleTest extends AutomationBase {
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	PeoplePage peoplepage;
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
    	 peoplepage = homepage.clickonPeoplePage();
    	 
	}
	
	/**
	 * Method to Validate Add Waiter option using Excel Data Handler.
	 * @throws Exception 
	 */
	@Test(priority=1, enabled=true)
	public void validateAddWaiter() throws Exception {
		ExcelDataHandler exceldatahandler = new ExcelDataHandler("waiter.xlsx", "Sheet1");
		String waiterName = exceldatahandler.getCellDataString(1, 0);
		String waiterPhone = exceldatahandler.getCellDataString(1, 1);
		String waiterEmail = exceldatahandler.getCellDataString(1, 2);
		String waiterStore = exceldatahandler.getCellDataString(1, 3);
		peoplepage.addWaiter(waiterName, waiterPhone, waiterEmail, waiterStore);
		
	}
	
	/**
	 * Method to Validate Add Customer option using Data Provider.
	 */
	@Test(priority=2, enabled = true, dataProvider="CustomerDetails")
	public void validateAddCustomer() {
		peoplepage.addCustomer(customerName, customerPhone, customerEmail);
	}
	@DataProvider(name="CustomerDetails")
	public Object[][] passDetails(){
		Object[][] data = new Object[0][2];
				data[0][0]="Aby";
				data[0][1]="9797979797";
				data[0][2]="aby@yahoo.com";
				return data;
				
	}
	
	/**
	 * Method to Validate Add Suppliers option Js Executor.
	 */
	public void validateAddSupplier() {
		
	}

}
