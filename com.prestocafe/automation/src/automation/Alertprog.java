package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprog {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://leafground.com/pages/Alert.html");
    driver.manage().window().maximize();
    WebElement Button1= driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
    WebElement Button2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
    WebElement Button3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
    WebElement Button4 = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
    Button1.click();
    Thread.sleep(2000);
    Alert alertbox1 =driver.switchTo().alert();
    System.out.println(alertbox1.getText());
    alertbox1.accept();
    Button2.click();
    Thread.sleep(2000);
    Alert alertbox2=driver.switchTo().alert();
    System.out.println(alertbox2.getText());
    alertbox2.accept();
    Button3.click();
    Thread.sleep(2000);
    Alert alertbox3 = driver.switchTo().alert();
    System.out.println(alertbox3.getText());
    alertbox3.sendKeys("Test");
    alertbox3.accept();
    System.out.println(driver.findElement(By.xpath("//p[@id='result1']")).getText());
    Button4.click();
    Thread.sleep(2000);
    Alert alertbox4=driver.switchTo().alert();
    alertbox4.accept();
    driver.close();
    }
}
