import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    double x, y, result;
    String operator;
    Scanner myObj = new Scanner(System.in);

    System.out.println("Type a number:");
    x = myObj.nextDouble();

    System.out.println("Type another number:");
    y = myObj.nextDouble();

    System.out.println("Choose an operation (+, -, *, /):");
    operator = myObj.next();

    switch(operator) {
      case "+":
        result = x + y;
        System.out.println("Result: " + result);
        break;
      case "-":
        result = x - y;
        System.out.println("Result: " + result);
        break;
      case "*":
        result = x * y;
        System.out.println("Result: " + result);
        break;
      case "/":
        if(y != 0) {
          result = x / y;
          System.out.println("Result: " + result);
        } else {
          System.out.println("Error: Division by zero");
        }
        break;
      default:
        System.out.println("Invalid operator");
        break;
    }

    myObj=null;
  }
}
