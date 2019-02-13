package test.naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupsHandle {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\DriversExeFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@value='fileupload']")).sendKeys("C:\\Users\\Spandana\\Desktop\\test.txt");

	}

}
