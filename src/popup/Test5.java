package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS'] ")).click();
		driver.findElement(By.xpath("//a[text()=' SkillRary Demo APP']"));
		Set<String> allwin = driver.getWindowHandles();
		for(String ele:allwin) {
			driver.switchTo().window(ele);
		}
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]"));
		
	}

}
