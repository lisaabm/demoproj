package com.automation.actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WebActionHelpers {
static WebDriver driver;
	
	
	/**
	 * method to launch the URL and maximize the window
	 */
	public void launchURL(WebDriver driver, String url) {
		try {
			driver.get(url);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			}catch(Exception e) {
			System.out.println("Launch Exception (WebActionHelper) : "+e.getMessage());
		}
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	/**
	 * method to navigate to URL
	 */
	public void navigateToURL(WebDriver driver, String url) {
		try {
			if(driver != null) {
				driver.navigate().to(url);
			}else {
				System.out.println("=========================\nWeb Action Helper : navigateToURL() --> driver NULL");
			}
		}catch(Exception e) {
			System.out.println("navigateToURL Exceprion (WebActionHelper) :"+e.getMessage());
		}
	}
	
	/**
	 * method to navigate backward
	 */
	public void navigateBack(WebDriver driver) {
		try {
			driver.navigate().back();
		}catch(Exception e) {
			System.out.println("navigateBack Exception (WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to navigate forward
	 */
	public void navigateForward(WebDriver driver) {
		try {
			driver.navigate().forward();
		}catch(Exception e) {
			System.out.println("navigateForward (WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to refresh browser
	 */
	public void refreshBrowser(WebDriver driver) {
		try {
			driver.navigate().refresh();
		}catch(Exception e) {
			System.out.println("refreshBrowser (WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to get the title of current site
	 */
	public String getSiteTitle(WebDriver driver) {
		String title = "";
		try {
			title = driver.getTitle();
		}catch(Exception e) {
			System.out.println("getSiteTitle (WebActionHelper) : "+e.getMessage());
		}
		return title;
	}
	/**
	 * method to get the URL of current site
	 */
	public String getSiteURL(WebDriver driver) {
		String url = "";
		try {
			url = driver.getCurrentUrl();
		}catch(Exception e) {
			System.out.println("getSiteURL (WebActionHelper) : "+e.getMessage());
		}
		return url;
	}
	
	/**
	 * method to accept alert box
	 */
	public void acceptAlert(WebDriver driver) {
		try {
			Alert alertBox = driver.switchTo().alert();
			alertBox.accept();
		}catch(Exception e) {
			System.out.println("acceptAlert (WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to dismiss alert box
	 */
	public void dismissAlert(WebDriver driver) {
		try {
			Alert alertBox = driver.switchTo().alert();
			alertBox.dismiss();
		}catch(Exception e) {
			System.out.println("dismissAlert (WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to get the content of alert box
	 */
	public String getAlertBoxContent(WebDriver driver) {
		String content = "";
		try {
			Alert alertBox = driver.switchTo().alert();
			content = alertBox.getText();
		}catch(Exception e) {
			System.out.println("getAlertBoxContent (WebActionHelper) : "+e);
		}
		return content;
	}
	
	/**
	 * method to switch to frame
	 * @throws Exception 
	 */
	public void switchToFrame(WebDriver driver, int index) throws Exception {
		try {
			driver.switchTo().frame(index);
		}catch(Exception e) {
			throw new Exception  ("switchToFrame(WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to switch to parent frame
	 * @throws Exception 
	 */
	public void switchToParentFrame(WebDriver driver) throws Exception {
		try {
			driver.switchTo().parentFrame();
		}catch(Exception e) {
			throw new Exception("switchToParentFrame(WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to close the current browser instance
	 * @throws Exception 
	 */
	public void closeCurrentWindow(WebDriver driver) throws Exception {
		try {
			driver.close();
		}catch(Exception e) {
			throw new Exception("closeCurrentWindow(WebActionHelper) : "+e.getMessage());
		}
	}
	
	/**
	 * method to close all the windows
	 * @throws Exception 
	 */
	public void closeallWindows(WebDriver driver) throws Exception {
		try {
			driver.quit();
		}catch(Exception e) {
			throw new Exception("closeCurrentWindow(WebActionHelper) : "+e.getMessage());
		}
	}
	

}
