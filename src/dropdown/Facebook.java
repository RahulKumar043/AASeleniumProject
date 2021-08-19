package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement droupdown = driver.findElement(By.id("month"));
		Select s=new Select(droupdown);
		s.selectByIndex(5);
		s.selectByValue("10");
		List<WebElement> count = s.getOptions();
		System.out.println(count.size());
		ArrayList l=new ArrayList<>();
		for(WebElement a:count) {
			String text = a.getText();
			System.out.println(text);
			l.add(text);
		}
		System.out.println("******aftershorting*******");
		Collections.sort(l);
		
		
		Object r;
		for(Object R:l) {
			System.out.println(R);
			
		}
		driver.close();
	}

}
