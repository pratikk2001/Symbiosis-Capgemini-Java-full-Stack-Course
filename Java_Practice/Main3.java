abstract class xyz {
    public int a = 5;

    // Concrete method
    public void display() {
        System.out.println("Value of a: " + a);
    }
}

public class Main3 extends xyz {

    // Constructor
    Main3() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Main3 obj = new Main3();
        obj.display();
    }
}
