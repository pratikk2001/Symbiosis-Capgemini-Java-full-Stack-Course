import java.util.Scanner; 

class Arithmatic{
  public static void main(String[] args) {
    double x, y, sum, sub, mul,div ;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = myObj.nextInt(); 

    System.out.println("Type another number:");
    y = myObj.nextInt();

    sum = x + y;  
    System.out.println("Addition is " + sum);
    
    sub = x - y;
    System.out.println("Subtraction is " + sub);

    mul = x * y;
    System.out.println("Multiplication is " + mul);

    div = x / y;
    System.out.println("Division is " + div);
	
     
  }
} 