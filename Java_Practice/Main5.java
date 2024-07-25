
interface InterfaceOne {
    void methodOne();
}

interface InterfaceTwo {
    void methodTwo();
}


class ImplementationClass implements InterfaceOne, InterfaceTwo {

  
    //@Override
    public void methodOne() {
        System.out.println("Method One from InterfaceOne");
    }

   
    //@Override
    public void methodTwo() {
        System.out.println("Method Two from InterfaceTwo");
    }
}

public class Main5 {
    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        
     
        obj.methodOne();
        obj.methodTwo();
    }
}
