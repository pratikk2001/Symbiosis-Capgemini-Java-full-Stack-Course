class Vehicle {
	int maxSpeed = 200;

public static void drive(){
System.out.println("Driving Vehical");

}

public void race(){
System.out.println("Driving Vehical");
}
}

class Car extends Vehicle{
int maxSpeed = 180;
	public static void drive(){
	System.out.println("Driving car");
	
	}
	public void race(){
	System.out.println("Driving speed"+ maxSpeed);
	
	
	}
	
	
}

public class QuestionT{
public static void main (String[] args){
Vehicle v = new Car();
v.drive();
v.race();
System.out.println(v.maxSpeed);
}
}