package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class ProductPage {
	
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	
	public ProductPage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Add Product']")
	public WebElement addprodctbtn;
	
	@FindBy(xpath="//a[text()='Download CSV']")
	public WebElement downloadcsvbtn;
	
	@FindBy (xpath="//a[text()='Upload CSV file']")
	public WebElement uploadfilebtn;
	
	@FindBy (xpath="//a[text()='PrintMenu']")
	public WebElement printbtn;
	
	

}
