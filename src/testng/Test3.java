package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/password/reset/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@Test
	public void CreateNewAccount() {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("emailOrPhone")).sendKeys("ysdgfuysg8526646");
		driver.findElement(By.name("fullName")).sendKeys("hgvfhtrcg");
		driver.findElement(By.name("username")).sendKeys("fhvthfvdsg");
		driver.findElement(By.name("password")).sendKeys("vcyrrerh54545");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
		
	}
	@AfterMethod
	public void closeApp() {
		
	}
	
		
	}


