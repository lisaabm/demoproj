package com.prestocafe.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.automation.actions.ClickActionHelpers;
import com.automation.actions.SendKeysActionHelpers;
import com.automation.actions.ValidationActionHelpers;

public class UtilityPage {
	WebDriver driver;
	ClickActionHelpers clickactionhelpers = new ClickActionHelpers();
	SendKeysActionHelpers sendkeysactionhelpers = new SendKeysActionHelpers();
	ValidationActionHelpers validationactionhelpers = new ValidationActionHelpers();
	
	
	public UtilityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement searchBox;
	
	public void searchForTheProduct(String searchValue) {
		searchBox.sendKeys(searchValue);
		
	}
	
	public void getAddedProductDetails() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//table[@id='Table']//td"));
		for(WebElement searchResult: searchResults ) {
			System.out.println(searchResult.getText());
		
		}
		
	}

}
