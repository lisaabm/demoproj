package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class HomePage {
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	SoftAssert soft = new SoftAssert();

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='POS']")
	public WebElement pos;
	
	@FindBy(xpath="(//span[text()='Product'])[1]")
	public WebElement product;
	
	@FindBy(xpath="//span[text()='Stores']")
	public WebElement stores;
	
	@FindBy(xpath="//span[text()='People']")
	public WebElement people;
	
	@FindBy(xpath="//span[text()='Sales']")
	public WebElement sales;
	
	@FindBy(xpath="(//span[text()='Expense'])[1]")
	public WebElement expense;
	
	@FindBy(xpath="//span[text()='Categories ']")
	public WebElement categories;
	
	@FindBy(xpath="//span[text()='Setting']")
	public WebElement setting;
	
	@FindBy(xpath="//span[text()='Reports']")
	public WebElement reports;
	
	

	

	

}
