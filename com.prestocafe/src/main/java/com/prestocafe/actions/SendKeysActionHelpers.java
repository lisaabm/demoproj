package com.prestocafe.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeysActionHelpers {
	
	/**
	 * Method to Enter Value using sendkeys.
	 * @param driver
	 * @param location
	 * @param InputValue
	 */
	public void enterValue(WebDriver driver,WebElement location,String EnterValue) {
		try {
			location.sendKeys(EnterValue);
		}
		catch(Exception e) {
			System.out.println("Excetion Occured" + e);
		}
	}
	
	/**
	 * Method to Enter Value using clear and sendkeys.
	 * @param driver
	 * @param location
	 * @param InputValue
	 */
	public void clearandEnterValue(WebDriver driver,WebElement location,String EnterValue) {
		try {
			location.clear();
			location.sendKeys(EnterValue);
		}
		catch(Exception e) {
			System.out.println("Excetion Occured" + e);
		}
	}

}
