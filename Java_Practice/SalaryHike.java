class Employee{  
 int salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=super.salary+100;  
} 

public class SalaryHike extends Programmer{  
 double hike = super.salary+super.bonus*0.10;  
 public static void main(String args[]){  
  
   System.out.println(new SalaryHike().hike);  
 
}   
}  