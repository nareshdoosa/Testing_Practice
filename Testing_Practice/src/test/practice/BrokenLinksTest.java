package test.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinksTest {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\DriversExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/404?");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		List<WebElement> alinks = new ArrayList<>();
		System.out.println(alinks.size());
		
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getAttribute("href") != null && !links.get(i).getAttribute("href").contains("javascript")) {
				alinks.add(links.get(i));
				
			}
		}
		
		for (int j = 0; j < alinks.size(); j++) {
			
			System.out.println(alinks.get(j).getAttribute("href"));
			HttpURLConnection connection = (HttpURLConnection)new URL(alinks.get(j).getAttribute("href")).openConnection();
			
			
			connection.connect();
			
			String response = connection.getResponseMessage();
			
			System.out.println(alinks.get(j).getAttribute("href")+"-----> "+connection.getResponseMessage());
			
			connection.disconnect();
			
			
		}
		


	}

}
