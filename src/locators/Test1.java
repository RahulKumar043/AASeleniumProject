package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	//	driver.get("https://twitter.com/login");
		Thread.sleep(4000);
		driver.findElement(By.name("session[username_or_email]")).sendKeys("rchngfjhgjbjbbjg");
		driver.findElement(By.name("session[password]")).sendKeys("jhgjhkjhl");
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
