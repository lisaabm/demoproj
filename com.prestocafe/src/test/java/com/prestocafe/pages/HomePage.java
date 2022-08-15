package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.actions.ClickActionHelpers;

public class HomePage {
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	
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
	
	@FindBy(xpath="//h1[text()=' Choose a store ']")
	public WebElement header;
	
	public ProductPage clickonProductPage() throws Exception {
		clickactionhelpers.click(driver, product);
		return new ProductPage(driver);
	}
	
	public StoresPage clickonStoresPage() throws Exception {
		clickactionhelpers.click(driver, stores);
		return new StoresPage(driver);
	}

	public PeoplePage clickonPeoplePage() throws Exception {
		clickactionhelpers.click(driver, people);
		return new PeoplePage(driver);
	}

}
