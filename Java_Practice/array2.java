import java.util.Scanner;

public class array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[]= new int[10];
		int count=0;

		for(int i=0; i<=4;i++){
			System.out.print("Enter the array element :");
			arr[i]=sc.nextInt();	
		}
		
		
		for(int i=0; i<=4;i++){
			System.out.println(">>>>   "+arr[i]);
		}
		
		System.out.println("Enter your Search :");
		int search = sc.nextInt();
		
		for(int i=0; i<=4;i++){
			
			if(arr[i]==search){
				count++;
			}
		}
	
	System.out.println("Count :"+count);
	
	}
}