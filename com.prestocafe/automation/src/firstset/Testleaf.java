package firstset;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import automation.WebDriverWait;

public class Testleaf {
	@Test
	public void radioButton()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		//WebDriverWait waitMe = new WebDriverWait(driver, Duration.ofSeconds(10));

		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "TestLeaf - Interact with Radio buttons", "Incorrect Title displayed");
		
		WebElement radiobtn0=driver.findElement(By.xpath("(//input[@name='age'])[1]"));
		radiobtn0.click();
		Boolean selected0=radiobtn0.isSelected();
		Assert.assertTrue(selected0, "1-20 age group not selected");
		
		WebElement radiobtn1=driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		Boolean selected1=radiobtn1.isSelected();
		Assert.assertFalse(selected1, "21-40 age group is not selected");
		
		WebElement radiobtn2=driver.findElement(By.xpath("(//input[@name='age'])[3]"));
		Boolean selected2=radiobtn2.isSelected();
		Assert.assertFalse(selected2, "Above 40 age group is not selected");
	}
	@Test
	public void table() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	   List<WebElement> allInputElements = driver.findElements(By.xpath("//table//tr/td[2]"));
	   for(WebElement inputElement : allInputElements) {
		   System.out.println(inputElement.getText());
	   }
	
	
	}
	

}
