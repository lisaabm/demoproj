package firstset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		Thread.sleep(2000);
		WebElement addcart1=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		addcart1.click();
		Thread.sleep(2000);
		WebElement addcart2=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		addcart2.click();
		Thread.sleep(2000);
		WebElement addcart3=driver.findElement(By.id("shopping_cart_container"));
		addcart3.click();
		Thread.sleep(2000);
		WebElement checkout1=driver.findElement(By.name("checkout"));
		checkout1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement remove=driver.findElement(By.name("remove-test.allthethings()-t-shirt-(red)"));
		remove.click();
		Thread.sleep(2000);
		WebElement checkout2=driver.findElement(By.name("checkout"));
		checkout2.click();		
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Lisa");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("Abraham");
		WebElement po=driver.findElement(By.name("postalCode"));
		po.sendKeys("12345");
		Thread.sleep(2000);
		WebElement continue1 = driver.findElement(By.name("continue"));
		continue1.click();
		Thread.sleep(2000);
		WebElement finish=driver.findElement(By.name("finish"));
		finish.click();
		Thread.sleep(2000);
		WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
	}
}
