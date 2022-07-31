package firstset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lisaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement dropdown1 = driver.findElement(By.cssSelector("select[id='Skills']"));
		Select dropdownSkills = new Select(dropdown1);
		dropdownSkills.selectByVisibleText("End User Support");
		String skills=dropdownSkills.getFirstSelectedOption().getText();
		System.out.println(skills); 
		
		WebElement dropdown2 = driver.findElement(By.cssSelector("select[id='yearbox']"));
		Select dropdownYear = new Select(dropdown2);
		dropdownYear.selectByIndex(80);
		String year=dropdownYear.getFirstSelectedOption().getText();
		System.out.println(year);
		
		WebElement dropdown3 = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select dropdownMonth = new Select(dropdown3);
		dropdownMonth.selectByValue("September");
		String month=dropdownMonth.getFirstSelectedOption().getText();
		System.out.println(month);
		List<WebElement> alloption=dropdownMonth.getOptions();
		for(WebElement months:alloption) {
		System.out.println(months.getText());}
		
		WebElement dropdown4 = driver.findElement(By.cssSelector("select[placeholder='Day']"));
		Select dropdownDay = new Select(dropdown4);
		dropdownDay.selectByIndex(27);
		Thread.sleep(3000);
		
		driver.get("https://demoqa.com/select-menu");
		System.out.println(driver.getTitle());
		WebElement multidd = driver.findElement(By.xpath("//select[@id='cars']"));
		Select cardd=new Select(multidd);
		cardd.selectByIndex(1);
		cardd.selectByIndex(2);
		cardd.deselectByIndex(1);
		cardd.selectByIndex(3);
		List<WebElement> alloptions=cardd.getOptions();
		for(WebElement cars:alloptions) {
		System.out.println(cars.getText());}
		Thread.sleep(3000);
		driver.close();

	}

}

