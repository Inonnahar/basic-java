package inonnahar;
import java.util.Scanner;
public class pt4 {

	public static void main(String[] args) {
//		int[] numList= {20,30,40,50,60,70,80,90};
//		
//int	sum=0;
//
//
//for(int number:numList) {
//	sum+=number;
//	
//}
//System.out.print(sum);
		
		
		
//		fibobnacci
		
		
//		
//	Scanner scan = new Scanner(System.in);
//	System.out.print("Enter your input value ");
//	int input=scan.nextInt();
//	System.out.print("Enter your substract value ");
//	int subs=scan.nextInt();
//	for( int i= 0; i<=input; i +=subs) {
//		System.out.println(i);
//		
//	}
//	

		
		
//		prime number
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter your input value ");
		int input=scan.nextInt();
		boolean data=true;
		for(int i=2; i<input; i++) {
			if(input%i==0) {
				data=false;
			}
			System.out.println(data);
		}
		if(data==true) {
			System.out.print(input+" it is a prime number");
		}else {
			System.out.print(input+" it is not a prime number");
		}
	
		
	
		
		
	
	}

}
