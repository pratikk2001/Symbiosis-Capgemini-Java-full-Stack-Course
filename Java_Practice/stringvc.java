import java.util.*;
import java.lang.*;

class stringvc{
        public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        int length=name.length();
        int count=0;
        for (int i=0;i<length-1;i++)
        {
                char ch=name.charAt(i);

                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                        count++;
                }
        }

        System.out.println("The number of vowles in name ="+ count);

        }
}