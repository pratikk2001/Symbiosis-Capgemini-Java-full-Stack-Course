import java.util.Scanner;

public class array{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
		
		int sum=0;
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++){
			System.out.print("Enter the number: ");
			arr[i]=scanner.nextInt();
			sum+=arr[i];
			
		}
		int avg = sum/n;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Avg is: "+avg);
	}

}

