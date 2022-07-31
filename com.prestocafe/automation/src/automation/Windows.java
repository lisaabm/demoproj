package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("//button[@id='home']"));
		button.click();
		Thread.sleep(12000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		for(String childs:windows) {
			driver.switchTo().window(childs);
		}
	}
}
