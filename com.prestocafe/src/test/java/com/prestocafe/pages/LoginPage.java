package com.prestocafe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.prestocafe.actions.ClickActionHelpers;
import com.prestocafe.actions.SendKeysActionHelpers;
import com.prestocafe.actions.ValidationActionHelpers;

public class LoginPage {
    
	WebDriver driver;
	ClickActionHelpers clickactionhelpers;
	SendKeysActionHelpers sendkeysactionhelpers;
	ValidationActionHelpers validationactionhelpers;
	
	public LoginPage(WebDriver  driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement usrname;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement pwd;
	
	@FindBy(xpath="//input[@name='submit']")
	public WebElement loginbtn;
	
	public void typeUsername(String username) {
		sendkeysactionhelpers.enterValue(driver, usrname, username);
	}
	public void typePassword(String password) {
		sendkeysactionhelpers.enterValue(driver, pwd, password);
	}
	public void clickLogin() throws Exception {
		clickactionhelpers.click(driver, loginbtn);
	}
	public HomePage login(String username, String password) throws Exception {
		sendkeysactionhelpers.enterValue(driver, usrname, username);
		sendkeysactionhelpers.enterValue(driver, pwd, password);
		clickactionhelpers.click(driver, loginbtn);
		return new HomePage(driver);
	}	
}


