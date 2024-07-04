import java.util.Scanner; 

class GreaterNumber{
  public static void main(String[] args) {
    int x, y, z;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type number 1:");
    x = myObj.nextInt(); 

    System.out.println("Type number 2:");
    y = myObj.nextInt();
	
	System.out.println("Type number 3:");
    z = myObj.nextInt();
	
	 int largest = x;

        if (y > largest) {
            largest = y;
        }

        if (z > largest) {
            largest = z;
        }

        System.out.println("The greatest number is: " + largest);

        myObj=null;
    }
}