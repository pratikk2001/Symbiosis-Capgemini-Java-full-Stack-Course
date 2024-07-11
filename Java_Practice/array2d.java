import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        int arr[][]=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter Elements :");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D array");
        for(int i=0;i<3;i++){
            {
                System.out.println();
                for(int j=0;j<2;j++){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }
}