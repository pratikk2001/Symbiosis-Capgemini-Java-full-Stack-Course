import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        float Item1 , Item2, total ;
		int disper;  

        Scanner myObj = new Scanner(System.in);

        System.out.print("Price of item 1 :");
        Item1 = myObj.nextFloat();

        System.out.print("Price of item 2 :");
        Item2 = myObj.nextFloat();
		
		total = Item1+Item2;
		System.out.println("Total amount :" + total );
		
		System.out.print("Discount in per:");
        disper = myObj.nextInt();

		
		float discount = (Item1+Item2)*(float)disper/100;
		System.out.println("Saved amount:" + discount );
		
		float saveAmt = total - discount ;
		System.out.println("Discounted amount:" + saveAmt );
		
       	

        myObj.close();
    }
}
