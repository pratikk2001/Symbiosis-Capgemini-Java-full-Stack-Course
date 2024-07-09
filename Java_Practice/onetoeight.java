// wap that reads and interger between 1 to 8 from user other wise exit

import java.util.Scanner;

public class onetoeight{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
		
		while(n<1 || n>8)
		{
			System.out.println("Number is Wrong");
			System.out.println("Enter a number: ");
			n = scanner.nextInt();
		}
		System.out.print("Number is Right");
	}
}