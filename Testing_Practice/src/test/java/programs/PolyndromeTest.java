package test.java.programs;

import java.util.List;
import java.util.Scanner;

public class PolyndromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, reverse;
		
		System.out.println("Enter a name : ");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		
		reverse = new StringBuffer(name).reverse().toString();
		
		System.out.println("Reverse String : "+reverse);
		
		if(name.equals(reverse))
		{
			if(name.length()%2==0)
			{
				System.out.println("Given String is even polyndrome");
			}
			else
			{
				System.out.println("Given String is odd polyndrome");
			}
		}
		else
		{
			System.out.println("Given String is not polyndrome");
			
			for (int i = 0; i < name.length(); i++) {
				
			}
			
		}

	}

}
