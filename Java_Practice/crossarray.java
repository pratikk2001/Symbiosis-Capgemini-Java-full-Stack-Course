import java.util.Scanner;

public class crossarray{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	
	int arr[][]= new int[3][3];
	int sum = 0;
	
	
	for(int i=0;i<=2;i++){
		for(int j=0;j<=2;j++){
			System.out.println("Enter array Element :");
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<=2;i++){
		System.out.println();
		for( int j=0;j<=2;j++){
			System.out.print(arr[i][j]+"\t");
			
		}
	}
	System.out.println();
	
	for(int i=0;i<=2;i++){
		for( int j=0;j<=2;j++){
			if(arr[i]==arr[j]){
				sum = sum + arr[i][j];
			}	
		}
	}
	System.out.println("Addition of cross element : "+sum);
  }
}