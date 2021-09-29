package Misc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablePractice {
	/**
	 * @author Rahul
	 * To handle WebTable Value using xpath locators
	 */
	@Test
	public void webTablehandling() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("123");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//tr[1]//a[text()='Organizations']")).click();
		List <WebElement> orgnames=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]"));
		
		for (int i =1 ; i < orgnames.size(); i++) {
			String name=orgnames.get(i).getText();
			if(name.equals("A92"))
			{
				driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+name+"']/../../td[1]")).click();
				break;
			}
			
		}
	}
}
