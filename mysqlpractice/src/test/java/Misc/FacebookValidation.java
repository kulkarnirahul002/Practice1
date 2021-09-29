package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookValidation {
@Test
	public void checkValidation() {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.=\"Create New Account\"]")).click();
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		/*
		 * WebElement female=driver.findElement(By.xpath("//input[@id='u_7_4_ol']"));
		 * WebElement male=driver.findElement(By.xpath("//input[@id='u_7_5_Cv']"));
		 * WebElement custom=driver.findElement(By.xpath("//input[@id='u_7_6_r/']"));
		 * WebElement age=driver.findElement(By.xpath("//input[@name='birthday_age']"));
		 */
		SoftAssert sa=new SoftAssert();
		//checking validation of each field if not entered
	
		firstname.sendKeys("Rahul");
		String f=firstname.getAttribute("value");
	
		System.out.println("first name value entered is :"+f);
		
		String f1=driver.findElement(By.xpath("//button[@name='websubmit']")).getText();
		System.out.println("attribute value is :"+f1);
//		  sa.assertEquals((firstname.getText()), " Rahul ", " No firstname mentioned");
	//	  sa.assertAll();
		 
		}
		
	
	}

