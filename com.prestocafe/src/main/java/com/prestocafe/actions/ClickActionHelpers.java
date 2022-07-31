package com.prestocafe.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickActionHelpers {
	public void click(WebDriver driver, WebElement element) throws Exception
	{
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		catch(Exception e) {
			throw new Exception("click (ClickActionHelper) : "+e.getMessage());
		}
	}
	public void rightClick(WebDriver driver, WebElement element) throws Exception
	{
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).contextClick().build().perform();
		}
		catch(Exception e) {
			throw new Exception("rightClick (ClickActionHelper) : "+e.getMessage());
		}
	}
	public void doubleClick(WebDriver driver, WebElement element) throws Exception{
		try {
			Actions act =new Actions(driver);
			act.moveToElement(element).contextClick().build().perform();
		}
		catch(Exception e) {
			throw new Exception("doubleClick (ClickActionHelper) : "+e.getMessage());
		}
	}
	public void clickOnXandY(WebDriver driver,WebElement element) throws Exception {
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).contextClick().build().perform();
		}
		catch(Exception e){
			throw new Exception("clickOnXandY (ClickActionHelper) : "+e.getMessage());			
		}
	}

}
