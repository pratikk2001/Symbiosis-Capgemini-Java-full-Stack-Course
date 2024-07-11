import java.util.Scanner;

public class onedarray{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	
	int arr1[]= new int[6];
	int arr2[]= new int[6];
	
	for(int i=0;i<6;i++){
		System.out.println("Enter array element :");
		arr1[i]=sc.nextInt();
	}
	
	for(int i=0;i<6;i++){
		System.out.print(arr1[i]+"\t");
	}
	
	for(int i=0;i<6;i++){
		if(arr1[i]%2!=0){
			System.out.println(arr2[i]);
		}
	}
	System.out.println("");
	System.out.println("");
	for(int i=0;i<6;i++){
		if(arr1[i]%2==0){
			System.out.print(arr2[i]+ "\t");
		}
	}
	
}
}