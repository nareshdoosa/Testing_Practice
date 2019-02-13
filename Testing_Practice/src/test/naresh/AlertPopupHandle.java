package test.naresh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\DriversExeFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		driver.findElement(By.xpath("//input[@title='Sign in']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String s = wait.until(ExpectedConditions.alertIsPresent()).getText();
		System.out.println(s);
		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		
//		Thread.sleep(5000);
//		
//		alert.accept();

	}

}
