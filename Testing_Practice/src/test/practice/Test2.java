package test.practice;


public class Test2 extends Test1{
	
	static int a = 10;
	
	public static void main(String[] args) {
	System.out.println("Test 2");
	
	int a = 5;
	
	System.out.println(a);
	//System.out.println(this.a);
	//System.out.println(super.a);
	//Assert.assertTrue(false);
	
	Test2 t2 = new Test2();
	
	t2.m1();
	}
	
	public void m1() {	
		int a = 2;
		
		this.a = a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	

}
