import java.util.Scanner;

public class array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
        int n = sc.nextInt();
		
		int arr[]= new int[n];
		int count=0;

		for(int i=0; i<n;i++){
			System.out.print("Enter the array element :");
			arr[i]=sc.nextInt();	
		}
		
		
		for(int i=0; i<n;i++){
			System.out.println(">>>>   "+arr[i]);
		}
		
		System.out.println("Enter your Search :");
		int search = sc.nextInt();
		
		for(int i=0; i<n;i++){
			
			if(arr[i]==search){
				count++;
			}
		}
	
	System.out.println("Count :"+count);
	
	}
}