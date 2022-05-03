package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {

	public static WebDriver driver;
	@BeforeTest
	public static void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
	}
	@Test
	public static void test1() throws InterruptedException{
		driver.findElement(By.xpath("//button[text()='Add Element']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
	}
	@AfterTest
	public static void CloseBroser(){
		driver.quit();
	}
}
