package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
