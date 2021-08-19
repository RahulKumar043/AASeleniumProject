package screeshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	

	private static File src;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//TypeCasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//access the methode photo will be taken and stored in RAM
		src = ts.getScreenshotAs(OutputType.FILE);
		//Required location
		File dest=new File("./photo/amazon.png");
		
		//copy paste the photo rom  to RAM required location
		FileUtils.copyFile(src, dest);
		
	}

}