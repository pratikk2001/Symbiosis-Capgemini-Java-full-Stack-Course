import java.util.Scanner;
 class radius
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double pi=3.142;
		
		System.out.println("Enter the Radius:");
		double radius = sc.nextInt();
		double area = pi*radius;
		System.out.printf("Area of circle : %.4f %n", area);
		
		double circumference = sc.nextInt();
		double area2=2*pi*radius;
		
		System.out.printf("Area of circumference : %.4f %n" , area2);
		
	}

}