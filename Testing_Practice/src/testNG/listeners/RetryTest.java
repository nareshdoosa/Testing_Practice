package testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	
	@Test
	public void test1() {
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		
		Assert.assertTrue(false);
	}

}
