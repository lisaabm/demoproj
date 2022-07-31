package firstset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSwag {
	@Test(priority=1)
	public void invalidLogin1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		username.sendKeys("test");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		pwd.sendKeys("test");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		WebElement errormsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		boolean errormsgvisibility=errormsg.isDisplayed();
		Assert.assertTrue(errormsgvisibility, "error message not displayed");
		loginbtn.click();
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority=2)
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		username.sendKeys("standard_user");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		pwd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		WebElement homepge=driver.findElement(By.xpath("//span[text()='Products']"));
		boolean homepgevisibility=homepge.isDisplayed();
		Assert.assertTrue(homepgevisibility, "homepage not displayed");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority=3)
	public void lockedLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		username.sendKeys("locked_out_user");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		pwd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		WebElement errormsg=driver.findElement(By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']"));
		boolean errormsgvisibility=errormsg.isDisplayed();
		Assert.assertTrue(errormsgvisibility, "error message not displayed");
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority=4)
	public void problemLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		username.sendKeys("problem_user");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		pwd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority=5)
	public void glitchLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		username.sendKeys("performance_glitch_user");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		pwd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority=6)
	public void emptyLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/","Directed to wrong url");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		boolean usernamevisibility=username.isDisplayed();
		Assert.assertTrue(usernamevisibility, "username field not displayed");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		boolean pwdvisibility=pwd.isDisplayed();
		Assert.assertTrue(pwdvisibility, "password field not displayed");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		boolean loginbtnvisibility=loginbtn.isDisplayed();
		Assert.assertTrue(loginbtnvisibility, "login button not displayed");
		loginbtn.click();
		WebElement errormsg=driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']"));
		boolean errormsgvisibility=errormsg.isDisplayed();
		Assert.assertTrue(errormsgvisibility, "error message not displayed");
		Thread.sleep(3000);
		driver.close();
	}
}
