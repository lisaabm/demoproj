package com.prestocafe.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsExecutorActionHelpers {
	
	/**
	 * Method to Enter Value using sendkeys in JS by ElementID.
	 * @param driver
	 * @param elementId
	 * @param text
	 * @throws Exception
	 */
	public void enterValueJsById(WebDriver driver, String elementId, String text) throws Exception {
		try { 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('"+elementId+"').value='"+text+"';");
		}catch(Exception e) {
			throw new Exception("sendKeysByJs (SendKeysActionHelper) "+e.getMessage());
		}
	}
	
	
	public void clickUsingJS(WebDriver driver, WebElement element) throws Exception {
		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
		catch(Exception e) {
			throw new Exception("clickUsingJs (ClickActionHeper) : "+e.getMessage());
		}
	}
	
	/**
	 * Method to Scroll to an Element using JavaScript Executor.
	 * @param driver
	 * @param element
	 * @throws Exception
	 */
	public void scrollToAnElement(WebDriver driver, WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}catch (Exception e) {
			throw new Exception("scrollToAnElement (UtilityActionHelper) : "+e.getMessage());
		}
	}
}
