package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By usrname = By.xpath("//input[@id='user-name']");
	By pwd = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");
	By invalidError = By.xpath("//h3[@data-test='error']");
	By lockedUserError = By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");
	By emptyFieldError = By.xpath("//h3[@data-test='error']");
	
	public void typeUsername(String Username) {
		driver.findElement(usrname).clear();
		driver.findElement(usrname).sendKeys(Username);
	}
	public void typePassword(String Password) {
		driver.findElement(pwd).clear();
		driver.findElement(pwd).sendKeys(Password);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public boolean invalidErrorMessageDisplayed() {
		return driver.findElement(invalidError).isDisplayed();
	}
	public boolean lockedoutErrorMessageDisplayed() {
		return driver.findElement(lockedUserError).isDisplayed();
	}
	public boolean emptyErrorMessageDisplayed() {
		return driver.findElement(emptyFieldError).isDisplayed();
	}

}

