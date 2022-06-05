package inonnahar;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
//	String input="hello world";
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		
//		String first=input.indexOf(0);
//		String second=input.indexOf(6);
//		String third= (first+second).toUpperCase();
//		
//		System.out.print(second);
//		
//		String third=input.substring(1,5).toLowerCase() ;
//		String fourth=input.substring(7).toLowerCase() ;
//		System.out.print("sub string value is "+first+third+" " +second+fourth);
//		System.out.print(input.substring(5));
//	System.out.print(input.indexOf("h"));
//	System.out.print(input.indexOf("w"));
		System.out.println(input.indexOf("h"));
		int hPosition = input.indexOf("h");
		
		System.out.println(input.substring(hPosition+1,input.length()));
		
		
		

	}

}
