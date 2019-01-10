package testNG.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter = 0, retry_limit=3;

	@Override
	public boolean retry(ITestResult result) {

		if(counter<retry_limit) {
			counter++;
			return true;
		}
		return false;
	}

}
