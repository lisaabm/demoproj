package com.prestocafe.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class ProductPage {
	
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();

	
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
	
	@FindBy(xpath="//select[@id='Type']")
	public WebElement type;
	
	@FindBy(xpath="//input[@id='ProductCode']")
	public WebElement code;
	
	@FindBy(xpath="//input[@id='ProductName']")
	public WebElement name;
	
	@FindBy(xpath="//select[@id='Category']")
	public WebElement category;
	
	@FindBy(xpath="//select[@name='supplier']")
	public WebElement suplier;
	
	@FindBy(xpath="//input[@id='PurchasePrice']")
	public WebElement purchaseprice;
	
	@FindBy(xpath="//input[@id='Tax']")
	public WebElement tax;
	
	@FindBy(xpath="//select[@id='taxType']")
	public WebElement taxmethod;
	
	@FindBy(xpath="//input[@id='Price']")
	public WebElement price;
	
	@FindBy(xpath="//input[@id='Unit']")
	public WebElement productunit;
	
	@FindBy(xpath="//textarea[@id='ProductOptions']")
	public WebElement product;
	
	@FindBy(xpath="(//button[text()='Submit'])[1]")
	public WebElement submitbtn;
	
	@FindBy(xpath="(//input[@type='search'])")
	public WebElement search;
	
	@FindBy(xpath="")
	public WebElement editbtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submit;
	
	//@FindAll(xpath="//table[@id='Table']//td", value = { @FindBy })
    //private List<WebElement> searchResults;
	
	
	@FindBy(xpath="(//table[@id='Table']//td)[1]")
	public WebElement productCode;
	
	@FindBy(xpath="(//table[@id='Table']//td)[2]")
	public WebElement productName;
	
	public void uploadFile(WebElement Element, String filename ) {
		
	}

}
