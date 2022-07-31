package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		

		WebElement clickmeBtn=driver.findElement(By.xpath("//button[@id='Click']"));
		clickmeBtn.click();
		System.out.println(clickmeBtn.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame);
		WebElement clickmeBtn1=driver.findElement(By.xpath("//button[@id='Click1']"));
		clickmeBtn1.click();
		System.out.println(clickmeBtn1.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.close();
		}
}
