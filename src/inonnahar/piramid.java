package inonnahar;

import java.util.Scanner;
public class piramid {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		char last , alphabet ;
		
		System.out.println("Enter your alphabet character: ");
		alphabet=scan.next().charAt(0);
		
		System.out.println("Enter your last character: ");
		last=scan.next().charAt(0);
		
		
		for(int i=alphabet; i<=last; i++){
			for(int j=0;j<=i;j++) {
				System.out.print(alphabet);	
				
			}
			alphabet++;
			System.out.println();	
			
			
		}
		
		
	}

}
