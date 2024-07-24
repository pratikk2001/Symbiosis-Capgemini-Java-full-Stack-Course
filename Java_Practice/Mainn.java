abstract class xyz {
    public int a = 5;

    // Concrete method
    public void display() {
        System.out.println("Value of a: " + a);
    }
}

public class Mainn extends xyz {

    // Constructor
    Mainn() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Mainn obj = new Mainn();
        obj.display();
    }
}
