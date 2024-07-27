import java.util.*;
class ArrayList4{  
 public static void main(String args[]){  
    ArrayList<Object> list=new ArrayList<>();
         
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter Name");
		   String name = sc.next();
		   
		   System.out.println("Enter RollNo");
		   int RollNo = sc.nextInt();
		   
		   list.add(name);
		   list.add(RollNo);
		   
		   System.out.println(list);

		   }
		}