package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
}

//
////Declare and initialise a fluent wait
//		FluentWait wait = new FluentWait(driver);
//		//Specify the timout of the wait
//		wait.withTimeout(Duration.ofSeconds(10));
//		//Sepcify polling time
//		wait.pollingEvery(Duration.ofSeconds(10));
//		//Specify what exceptions to ignore
//		wait.ignoring(NoSuchElementException.class);
//
//		//This is how we specify the condition to wait on.
//		//This is what we will explore more in this chapter
//		wait.until(ExpectedConditions.alertIsPresent());
