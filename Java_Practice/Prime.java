import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

       
       int flag =0;
	   
   
            for (int i = 2; i <= n / 2; i++) { 
                if (n % i == 0) {
                    flag =1;
                    break; 
                }
            }
			if(flag==0){
				System.out.print("Number is prime:");		
        }else{
			System.out.print("Number is not prime:");
		}
       
        scanner.close();
    }
}
