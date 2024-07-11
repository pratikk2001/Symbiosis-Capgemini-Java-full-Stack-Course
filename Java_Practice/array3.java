import java.util.Scanner;

public class array3{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	
	int arr[][]= new int[3][3];
	int row = 0;
	int col = 0;
	
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
			row = row+arr[i][j];
			col = col+arr[j][1];
			
		}
		System.out.println("Addition  of row");
		System.out.println("Sum of row"+(i+1)+" : "+row);
		System.out.println("Addition  of col");
		System.out.println("Sum of col"+(i+1)+" : "+col);
		col=0;
		row=0;
	}
  }
}