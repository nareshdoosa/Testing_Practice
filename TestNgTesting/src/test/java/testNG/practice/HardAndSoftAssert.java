package testNG.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAndSoftAssert {
	
	@Test
	public void hardAssert() {
		
		System.out.println("1");
		
		Assert.assertTrue(false);
		
		System.out.println("2");
		
	}

}
