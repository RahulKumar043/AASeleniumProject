package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	

public WebDriver driver;
@BeforeMethod
public void openApp() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

@Test
public void login() throws InterruptedException {
driver.findElement(By.name("username")).sendKeys("hgfdwd");
driver.findElement(By.name("password")).sendKeys("hsfgfkasfdtfa");
driver.findElement(By.xpath("//div[text()='Log In']")).click();
Thread.sleep(2000);
String t = driver.getTitle();
Reporter.log(t,true);
String url = driver.getCurrentUrl();
Reporter.log(url,true);
}
@AfterMethod
public void closeApp() 
{
driver.close();


}
}

