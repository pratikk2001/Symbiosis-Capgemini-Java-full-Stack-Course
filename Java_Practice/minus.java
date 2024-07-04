import java.util.Scanner;

class negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
		int min=num;
		int max=num;
		
		while(true){
			num = sc.nextInt();
			if(num>max)
				max=num;
			if(num<min && num>0)
				min=num;
			if(num=0)
				break;
		}
		
		System.out.println("Max"+max " " "Min"+min );
}		
		
