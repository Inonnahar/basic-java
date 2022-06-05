import java.util.Scanner;

class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Input your age :");
		// int age = scan.nextInt();

		// System.out.println("My age is : " + age);

		// scan.nextLine();

		// System.out.println("input your name:");
		// String name = scan.nextLine();
		// System.out.println("My name is : " + name);


		// System.out.println("Enter your name:");
		// String name = scan.nextLine();
		// System.out.println("My name is:" + name);
		// System.out.println("Enter your email address:");
		// String email=scan.nextLine();
		// System.out.println("My email is:" + email);
		// System.out.println("Enter your phone number:");
		// int phone =scan.nextInt();
		// System.out.println("My number is:" + phone);
		// System.out.println("Enter your selary:");
		// double selary=scan.nextDouble();
		// System.out.println("My name is:" + selary);

		// scan.nextLine();
		// System.out.println("Enter your address:");
		// String address=scan.nextLine();
		// System.out.println("My address is:" + address);


		// product();


		info();


	}



	// public static void product(){
	// 	Scanner scanp=new Scanner(System.in);
	// 	System.out.print("product name: ");
	// 	String pname=scanp.nextLine();
	// 	System.out.println("product name is:" + pname);
	// 	System.out.println("product price:");
	// 	int pprice=scanp.nextInt();
	// 	System.out.println("product price is:" + pprice);
	// 	System.out.println("product Quantity:");
	// 	int pqty=scanp.nextInt();
	// 	System.out.println("product total value:" + (pprice * pqty));

	// }
	public static void info(){
		Scanner bio = new Scanner(System.in);

	System.out.print("Name: ");
	String name=bio.nextLine();
	System.out.print("Age: ");
	int age=bio.nextInt();
	bio.nextLine();
	System.out.print("Blood group: ");
	String bGroup=bio.nextLine();
	System.out.print("Address: ");
	String address=bio.nextLine();

	System.out.print("Name: " + name + " " + "Age:" + " " + age + " " + "Blood group: " + bGroup + " " + "Address: " + address +"\n");


	}
}