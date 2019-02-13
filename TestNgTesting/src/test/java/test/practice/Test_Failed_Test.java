package test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Failed_Test {
	
	@Test
	public void test1(){
	System.out.println("Test 1");
	Assert.assertTrue(true);
	}
	
	@Test
	public void test2(){
	System.out.println("Test 2");
	Assert.assertTrue(true);
	}
	
	@Test
	public void test3(){
	System.out.println("Test 3");
	Assert.assertTrue(true);
	}
	
	@Test
	public void test4(){
	System.out.println("Test 4");
	Assert.assertTrue(false);
	}

}
