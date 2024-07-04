import java.util.Scanner;

class lucky {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the 4-digit number  ");
        int num = myObj.nextInt();
		
		if(num>1000 || num < 9999){
			System.out.println("enter valid number");
			
		}
		
		int a = num/1000;
		int b = (num/100)%10;
		int c = (num/10)%10;
		int d = num%10;
		
		
		if ((a+b)==(c+d)){
			System.out.println("lucky");
		}else{
			System.out.println("unlucky");
		}
		myObj.close();
	}
}