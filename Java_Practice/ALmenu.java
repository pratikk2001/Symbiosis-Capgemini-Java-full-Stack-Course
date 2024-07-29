import java.util.*;
class ALmenu{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                ArrayList<Integer> list=new ArrayList<Integer>();
                int ch;
                while(true){

                System.out.println("1: Insert");
                System.out.println("2: Remove");
                System.out.println("3: Sort");
                System.out.println("4: Display");
                System.out.println("5: Exit");

                ch=sc.nextInt();


                switch(ch){
                        case 1:
                                System.out.println("Enter numbers(0 to exit)");
                                while(true){
                                int a;
                                a=sc.nextInt();
                                if(a==0){
                                break;
                                }
                                list.add(a);
                                }

                                System.out.println(list);

                                break;
                        case 2:
                                System.out.println("Enter element to remove:");
                                int r=sc.nextInt();
                                
                                if (list.contains(r)){
                                list.remove(r);
                                }
                                System.out.println(list);
                                break;

                        case 3:
                                Collections.sort(list);
                                System.out.println("Array List After Sorting:");
                                System.out.println(list);

                             break;

                        case 4:
                                System.out.println("Displaying Array List:");
                                System.out.println(list);

                             break;

                        case 5:
                                System.exit(0);


                        default:
                                System.out.println("Enter valid input");
                                break;
                }


                }
                   }
                                }

