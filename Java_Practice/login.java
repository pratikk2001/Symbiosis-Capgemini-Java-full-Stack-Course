import java.util.Scanner;

class login{
	public static void main(String[] args) {
		String user = "pratik";
		String pass = "pratik123";
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter User id :" );
		String enteruser = myObj.next();
		
		System.out.print("Enter pass :" );
		String enterpass = myObj.next();
		
		if(enteruser==user){
		System.out.print("User name is right");
		
			if(enterpass==pass){
				System.out.print("Login Sucessful");
		}
		else{
			System.out.print("Wrong Pass ");
		}
		}else {
			System.out.print("Wrong User ");
		}
	}
}
			
			
		
		