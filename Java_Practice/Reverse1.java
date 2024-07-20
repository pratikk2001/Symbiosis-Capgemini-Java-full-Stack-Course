import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();

        String word[] = input.split(" ");

        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
        
        sc.close();
    }
}
