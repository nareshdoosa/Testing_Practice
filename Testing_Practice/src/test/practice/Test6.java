package test.practice;

public class Test6 {

	  static int a = 10;
	 
	 Test6(){
		 int a = 5;
		 System.out.println("Constructer  "+a);
		 System.out.println("Constructer  "+this.a);
	 }
	 
	 {
		 System.out.println("Instant block  "+a);
	 }
	 
	 static {
		 System.out.println("Static block  "+a);	 
	 }
	
	public static void main(String[] args) {
		System.out.println(a);
		Test6 t = new Test6();
		System.out.println(a);
		
		m1();
		
	}

	
	public static void m1() {
		//System.out.println(a);
	}
}
