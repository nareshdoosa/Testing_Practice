package test.java;

public class StringConcat {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "world";
		
		System.out.println("Before Concat" + "\ns1:" + s1 + "\ns2:" + s2);
		
		//s1 = s1.concat(s2);
		s2 = s2.concat(s1);
		
		System.out.println("After Concat" + "\ns1:" + s1 + "\ns2:" + s2);
	}
}