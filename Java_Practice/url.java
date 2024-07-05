import java.util.Scanner;
 class url
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the URL: ");
		String url= sc.next();
		
		System.out.print("Check the URL is Secure or not: ");
		String secure= sc.next();
		
		if(url.contains(secure)){
		System.out.print("It contain https :"+secure );
		}else{
		System.out.print("It dosen't Contain https :"+secure);
		}
	}
}


