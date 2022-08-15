package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class StoresPage {
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	
	
	public StoresPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement addStoreBtn ;

	@FindBy(xpath="//input[@id='StoreName']")
	public WebElement storeName ;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='StorePhone']")
	public WebElement storePhone;
	
	@FindBy(xpath="//input[@id='Country']")
	public WebElement country;
	
	@FindBy(xpath="//input[@id='Adresse']")
	public WebElement address;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submitBtn;
	
}

