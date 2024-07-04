import java.util.Scanner;

class Profitloss {
    public static void main(String[] args) {
        Float toysDozens , priceDozens , pricePerToy ;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the number of dozens of toys purchased ");
        toysDozens = myObj.nextFloat();

        System.out.print("Enter the price per dozen : ");
        priceDozens = myObj.nextFloat();

        System.out.print("Enter the selling price of 1 toy : ");
        pricePerToy = myObj.nextFloat();
		
		
		
		double costPerToy = priceDozens/12;
		double profit = (pricePerToy-costPerToy);
		
       	System.out.println("Profit in percentage:"+ (profit*100)/costPerToy);

        myObj.close();
    }
}
