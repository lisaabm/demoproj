package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class PeoplePage {
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	
	
	public PeoplePage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Waiters']")
	public WebElement waiters;
	
	@FindBy(xpath="//span[text()='Customers']")
	public WebElement customers;
	
	@FindBy(xpath="Suppliers")
	public WebElement suppliers;
	
	@FindBy(xpath="//button[contains(.,'Waiter')]")
	public WebElement addwaiter;
	
	@FindBy(xpath="//input[@id='WaiterName']")
	public WebElement waitername;
	
	@FindBy(xpath="//input[@id='WaiterPhone']")
	public WebElement waiterphone;
	
	@FindBy(xpath="//input[@id='WaiterEmail']")
	public WebElement waiteremail;
	
	@FindBy(xpath="//input[@id='WaiterStore']")
	public WebElement waiterstore;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement waitersubmitbtn;
	
	@FindBy(xpath="//input[@id='CustomerName']")
	public WebElement customername;
	
	@FindBy(xpath="//input[@id='CustomerPhone']")
	public WebElement customerphone;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	public WebElement customeremail;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement customersubmitbtn;
	
	public void addWaiter(String waiterName,String waiterPhone,String waiterEmail,String waiterStore) throws Exception {
		clickactionhelpers.click(driver, waitername);
		sendkeysactionhelpers.clearandEnterValue(driver, waitername, waiterName);
		clickactionhelpers.click(driver, waiterphone);
		sendkeysactionhelpers.clearandEnterValue(driver, waiterphone, waiterPhone);
		clickactionhelpers.click(driver, waiteremail);
		sendkeysactionhelpers.clearandEnterValue(driver, waiteremail, waiterEmail);
		clickactionhelpers.click(driver, waiterstore);
		sendkeysactionhelpers.clearandEnterValue(driver, waiterstore, waiterStore);
		
	}
	
	public void addCustomer(String customerName,String customerPhone,String customerEmail ) throws Exception {
		clickactionhelpers.click(driver, customername);
		sendkeysactionhelpers.clearandEnterValue(driver, customername, customerName);
		clickactionhelpers.click(driver, customerphone);
		sendkeysactionhelpers.clearandEnterValue(driver, customerphone, customerPhone);
		clickactionhelpers.click(driver, customeremail);
		sendkeysactionhelpers.clearandEnterValue(driver, customeremail, customerEmail);
	}

}
