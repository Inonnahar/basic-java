package inonnahar;
import java.util.Scanner;
public class substring2 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		int sub1=input.indexOf("h");
		int sub2=input.indexOf("w");
		String sub3=input.substring(sub1,sub1+1).toUpperCase();
		
		String sub5=input.substring(sub1+1,input.indexOf("w")).toLowerCase();
		String sub4=input.substring(sub2,sub2+1).toUpperCase();
		String sub6=input.substring(sub2+1).toLowerCase();
		System.out.print(sub3+sub5+" "+sub4+sub6);
	}

}
