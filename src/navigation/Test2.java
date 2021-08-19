package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9472034558");
		driver.findElement(By.name("pass")).sendKeys("9472034558");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getTitle());
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
