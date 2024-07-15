import java.util.*;
class str1{
	public static void main(String args[]){
		String s1= "Bhagirath";
		System.out.println("S1  ="+ s1);
		int length =s1.length();
		System.out.println("S1 Length ="+ length);
		System.out.println("S1 lowercase ="+ s1.toLowerCase());
		System.out.println("S1 uppercase ="+ s1.toUpperCase());
		System.out.println("S1 replace a to z ="+ s1.replace('a','z'));
		System.out.println("S1 indexOf ="+ s1.indexOf('e'));
		System.out.println("S1 indexOf ="+ s1.lastIndexOf('e'));
		
		String s2= "ViewSonic";
		System.out.println("S2  ="+ s2);
		System.out.println("S1 and S2 trim ="+ s1.trim() + s2.trim());
		System.out.println("S1 and S2 equals ="+ s1.equals(s2));
		System.out.println("S1 and S2 equals ignoring case ="+ s1.equalsIgnoreCase(s2));
		System.out.println("S1 and S2 compareTo ="+ s1.compareTo(s2));
		System.out.println("S1 and S2 Concate"+ s1.concat(s2));
		System.out.println("S1 substring(n) ="+ s1.substring(5));
		System.out.println("S1 substring(n,m) ="+ s1.substring(5,8));
		System.out.println("S1 toString() ="+ s1.toString());

		int i=100;
		System.out.println("S1.valueOf(variable) ="+ (s1.valueOf(i)).length());
		
	}
	
}