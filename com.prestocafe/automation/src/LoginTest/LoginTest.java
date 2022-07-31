package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginpg;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\lisaa\\Downloads\\chromedriver103\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	//1. Verify whether Error Message is displayed when entered invalid credentials.
	@Test(priority=1)
	public void validateInvalidUsernameErrorMessage() {
		loginpg=new LoginPage(driver);
		loginpg.typeUsername("test");
		loginpg.typePassword("test");
		loginpg.clickLogin();
		Assert.assertTrue(loginpg.invalidErrorMessageDisplayed(), "Error Message is not displyed");
	}
	
	//2. Verify whether Error Message is displayed when entered Locked-out-user credentials.
	@Test(priority=2)
	public void validatelockedoutUsernameErrorMessage() {
		loginpg=new LoginPage(driver);
		loginpg.typeUsername("locked_out_user");
		loginpg.typePassword("secret_sauce");
		loginpg.clickLogin();
		Assert.assertTrue(loginpg.lockedoutErrorMessageDisplayed(), "Error Message is not displyed");
	}
	
	//3. Verify whether Error Message is displayed when clicked login button without entering credentials.
	@Test(priority=3)
	public void validateEmptyUsernameErrorMessage() {
		loginpg=new LoginPage(driver);
		loginpg.clickLogin();
		Assert.assertTrue(loginpg.emptyErrorMessageDisplayed(), "Error Message is not displyed");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
