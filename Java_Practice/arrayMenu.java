import java.util.*;
class arrayMenu{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int ch;
		while(true){
		
		System.out.println("1 : Insert");
		System.out.println("2 : Remove");
		System.out.println("3 : Sort");
		System.out.println("4 : display");
		System.out.println("5 : Exit");
		
		ch = sc.nextInt();
	    switch(ch){
			case 1:
			 System.out.println("Enter the number want to Insert");
			  while (true) {
			   int a;
			   a = sc.nextInt();
			   if(a==0){
				break;
			}
            list.add(a);
			
            }
			System.out.println(list);
			break;
			
			case 2:
			 System.out.println(" Entered number want to remove :");
			 int r=sc.nextInt();
				if(list.contains(r)){
					list.remove(r);
				}
				System.out.println(list);
			
			break;
			
			case 3:
			 Collections.sort(list);
			 System.out.println("Sorted the array list:");
			 System.out.println(list);
			
			
			break;
			
			case 4:
			 System.out.println("Displaying the array list :");
			 System.out.println(list);
			
			
			break;
			
			case 5:
			 
			System.exit(0);
			
			break;
			
			default:
			System.out.println("Invalid input :");

			break;
			
			
		}
		   
		
			
			
}
}
}