public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Method to display the coordinates
    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(p1); // Copy constructor is called

        p1.display(); // Outputs: Point(5, 10)
        p2.display(); // Outputs: Point(5, 10)
    }
}
