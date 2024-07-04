import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        double principal, interest;
        int years, timesCompounded;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        principal = myObj.nextDouble();

        System.out.print("Rate of interest: ");
        interest = myObj.nextDouble();

        System.out.print("No of times interest is compounded per year: ");
        timesCompounded = myObj.nextInt();

        System.out.print("Time period in years: ");
        years = myObj.nextInt();

        double compoundInterest = principal * Math.pow((1 + (interest / 100) / timesCompounded), timesCompounded * years);

        System.out.printf("The compound interest after %d years is: %.2f\n", years, compoundInterest);

        myObj.close();
    }
}
