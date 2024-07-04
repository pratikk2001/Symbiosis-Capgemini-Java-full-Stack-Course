import java.util.Scanner;

class palindrome{
		public static void main(String[] args);
		int rim, sum=0, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int n = sc.nextInt();
		
		temp=n;
		
		
		while(temp>0){
			rim=temp%10;
			sum=(sum*10)+rim;
			temp=temp/10;
			
}
			if(temp==sum){
			System.out.println("number is palindrome");
			}else{
			System.outprintln("number is not palindrome");
			}
				
}		
		
	
}