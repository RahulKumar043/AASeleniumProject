package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.id("course"));
		WebElement ele = driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).perform();
		//driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		Thread.sleep(3000);
		a.doubleClick(ele).perform();
	}

}
