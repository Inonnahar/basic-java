
class Primary{
	public static void main(String[] args){

		String fName = "inonnahar";
		String lName = "Hawlader";
		System.out.println(fName + " " +lName);

		logic();


	}


	public static void logic(){

		int a = 20;
		String b=(a + " " + "inonnahar");
		System.out.println("Hawlader" + " " + b);



		int x = 50;
		int y = (60 + x);
		int z = (80 + y);
		System.out.println(z);
		int f = 50;
		int g = (60 - f);
		int h = (80 / g);
		int i = (h * 8);
		System.out.println(i);




		int s = 50;
		int t = 80;
		int u = 60;
		int v = 2;
		int w = 2;
		int q =( (((s + t )- u) * v )/ w);
		System.out.println(q);

	}
}