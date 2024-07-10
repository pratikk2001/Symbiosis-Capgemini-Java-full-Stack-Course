import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
class biginteger {
  public static void main(String[] args) {
    // creates an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a big integer: ");
    // reads the big integer
    BigInteger value1 = sc.nextBigInteger();
    System.out.println("Using nextBigInteger(): " + value1);
    System.out.print("Enter a big decimal: ");
    // reads the big decimal
    BigDecimal value2 = sc.nextBigDecimal();
    System.out.println("Using nextBigDecimal(): " + value2);
    sc.close();
  }
}