// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
1)right (+x) -> 10
2)up (+y)-> 20
3)left (-x)-> 30
4)down (-y)-> 40
5)right (x+)->50
from 1)

for 3
    x     y     func   units
1)  10    0      x++    10
2)  10   20      y+     20
3) -20   20     -x      30
4) -20  -20     -y      40
5)  30  -20     x+      50
6)  30   40     y+      60
7) -40   40    -y       70
*/

public class predict {
    public static int[] move(int n) {
        int x = 0;
        int y = 0;
        int units = 10;
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            if (counter == 1 || counter == 5) {
                x += units;
            } else if (counter == 2) {
                y += units;
            } else if (counter == 3) {
                x -= units;
            } else{
                y -= units;
            }
            System.out.println("Step " + i + ": x=" + x + ", y=" + y);
            units += 10;
            counter++;
            if (counter > 5) {
                counter = 1;
            }
        }
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = move(n);
        System.out.println("Final Position: " + arr[0] + ", " + arr[1]);
    }
}
