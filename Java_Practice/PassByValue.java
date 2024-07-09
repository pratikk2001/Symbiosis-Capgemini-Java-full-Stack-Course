public class PassByValue {
    public static void changevalue(int a,int b)  {
        a=a+2;
        b=b+2;
        System.out.println("In function changes are " + a + " and " + b);
    }
    public static void main(String args[])   {
        int x=10,y=20;
        System.out.println("Before calling the function");
        System.out.println("x=" + x + " and y=" + y);
        changevalue(x,y);
        System.out.println("After calling the function");
        System.out.println("x=" + x + " and y=" + y);
    }
}