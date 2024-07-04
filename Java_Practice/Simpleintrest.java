import java.util.Scanner; 

class Simpleintrest{
  public static void main(String[] args) {
    int Principle, time ;
	double intrest;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter the Amount:");
    Principle = myObj.nextInt(); 

    System.out.println("Time period:");
    time = myObj.nextInt();
	
	System.out.println("Rate of intrest");
    intrest = myObj.nextDouble();

    double Simpleinterest = (Principle*time*intrest)/100;
	System.out.println("simple intrest is:");
	System.out.println(Simpleinterest);
  
  }
} 