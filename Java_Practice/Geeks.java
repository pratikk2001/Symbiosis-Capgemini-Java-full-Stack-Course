// Java Program to demonstrate
// Constructor
import java.io.*;

// Driver Class
class Geeks {
  
    // Constructor
    Geeks(String a)
    {
        super();
        System.out.println("Constructor Called  :"+a);
    }

    // main function
    public static void main(String[] args)
    {
        Geeks geek = new Geeks("Pratik");
    }
}
