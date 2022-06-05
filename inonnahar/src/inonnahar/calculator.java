
package inonnahar;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		
		char operator;
		double num1,num2,result;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose your operator: +, -, * or /");
		operator = scan.next().charAt(0);
		System.out.println("Enter your first number");
		
		num1=scan.nextDouble();
		
	System.out.println("Enter your second number");
		
		num2=scan.nextDouble();
		
		switch(operator) {
		case '+':
			result=num1 + num2;
			System.out.print(num1+"+"+num2+"="+result);
			break;
		case '-':
			result=num1 - num2;
			System.out.print(num1+"-"+num2+"="+result);
			break;
		case '*':
			result=num1 * num2;
			System.out.print(num1+"*"+num2+"="+result);
			break;
		case '/':
			result=num1 / num2;
			System.out.print(num1+"/"+num2+"="+result);
			break;
		default:
			
			System.out.print("Invalid Operator");
			break;
		}

	}

}
