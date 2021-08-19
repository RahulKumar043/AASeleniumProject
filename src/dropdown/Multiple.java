package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/cute%20puja/New%20folder/practice.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.id("MTR"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("5");
		Thread.sleep(3000);
		s.selectByVisibleText("chiken");
		Thread.sleep(3000);
		s.deselectByIndex(2);
		s.deselectByValue("5");
		s.deselectByVisibleText("chiken");
		System.out.println(s.isMultiple());
		if(s.isMultiple()) {
			s.deselectAll();
		}
		driver.close();
		}
	}


