package test.naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\DriversExeFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.name("email")).sendKeys("naresh.doosa");
		driver.findElement(By.name("password")).sendKeys("naresh.2050");
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.backgroundColor = rgb(0,200,0)", element);
		//js.executeScript("arguments[0].style.backgroundColor = '"+element.getCssValue("backgroundColor")+"'", element);

	}

}
