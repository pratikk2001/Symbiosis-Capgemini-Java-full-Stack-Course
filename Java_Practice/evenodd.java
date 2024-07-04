import java.util.Scanner; 

class evenodd{
  public static void main(String[] args) {
    int x ;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = myObj.nextInt(); 
	if(x%2==0){
	 System.out.println("No is Even");
	 }else{
	 System.out.println("No is odd");
	 }
	}
}

