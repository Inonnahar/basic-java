package inonnahar;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		double num1, num2, num3,num4,num5;
		num1=1;
		num2=2;
		num3=scan.nextDouble();
		
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		for(double i=0; i<=num3; i++) {
			num4=num1+num2;		
			System.out.print(num4+" ");
			
			num1=num2;
			num2=num4;
			
			
			}
		
	}

}
