import java.util.*;
class duplicate{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter number :");
		   
		   while (true) {
			   int a;
			   a = sc.nextInt();
			
			if(a==0){
				break;
			}
            list.add(a);
        }
			System.out.println(" Entered number is :");
		    System.out.println(list); 
			
			
			ArrayList<Integer> removeduplicate = new ArrayList<Integer>();
			
			System.out.println(" Entered number want to remove :");
			int r=sc.nextInt();
				if(list.contains(r)){
					list.remove(r);
				}else{
					System.out.println(" Elements not found:");
				}
				System.out.println(list);
			
			
			for(Integer n : list){
				if(!removeduplicate.contains(n)){
					removeduplicate.add(n);
					
				}
				
			}
		System.out.println(" After removing uplicate number is :");
		    System.out.println(removeduplicate); 
}
}