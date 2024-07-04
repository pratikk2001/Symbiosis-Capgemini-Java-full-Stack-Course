class profit {
    public static void main(String[] args) {
        double buyingPrice=20.54;  
        double sellingPrice=30.50;
		
		System.out.println("Buying Price is :"+ buyingPrice);
		System.out.println("Selling Price is :"+ sellingPrice);
		
		double profit = sellingPrice-buyingPrice;

		System.out.println("Profit in percentage:"+ (profit*100)/buyingPrice);

        
    }
}