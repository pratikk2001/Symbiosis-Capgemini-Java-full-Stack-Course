import java.util.Scanner; 

class Salary{
  public static void main(String[] args) {
  int sal,amount;
  String name;
  
   Scanner myObj = new Scanner(System.in); 
    System.out.println("Basic salary:");
    sal = myObj.nextInt(); 
	
	System.out.println("Employee Name:");
    name = myObj.next();

    System.out.println("Withdraw Amount:");
    amount = myObj.nextInt();
	
	if (amount>sal){
		System.out.println("You dont have enough salary");
	}else if (sal<=25000){
		int Balance = sal-amount;
		System.out.println(Balance);
		
	}
	else
	{
		double tax = sal * 0.1;
		double Balance = tax+amount;
		System.out.println(Balance);
	}
	
  }
}