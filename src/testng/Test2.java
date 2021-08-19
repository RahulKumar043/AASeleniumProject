package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
public WebDriver driver;
@BeforeMethod
public void openApp() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Test
public void forgotPassword() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.name("cppEmailOrUsername")).sendKeys("jsdfjdgfkjsfkajsgfskj");
	driver.findElement(By.xpath("//button[text()='Send Login Link']")).click();
	
	Thread.sleep(2000);
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	}
@AfterMethod
public void closeApp() {

}
}


	

