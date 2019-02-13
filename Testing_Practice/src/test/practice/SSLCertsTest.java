package test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertsTest {

	public static void main(String[] args) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\DriversExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.cacert.org");

		

	}

}
