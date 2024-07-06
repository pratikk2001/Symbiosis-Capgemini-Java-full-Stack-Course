import java.util.Scanner;

class exceed{
	public static void main(String[] args)
	{
	int sum=0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the sum");
	     
		 while(sum<=100){
		 int num= sc.nextInt();
		 
		 sum = sum+num;
	
		if(sum<=100){
		System.out.println(sum);
	}
		 }
	System.out.println("sum is exceed 100");
}
}
