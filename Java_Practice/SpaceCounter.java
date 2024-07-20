import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();  // Use nextLine() to read the entire line
        
        int spaceCount = countSpaces(input);
        System.out.println("Number of spaces: " + spaceCount);
        
        sc.close();
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
