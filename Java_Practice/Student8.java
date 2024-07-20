class Student8{
	int rollno;
	String name;
	static String college="ITS";
	
	Student8(int r,String n){
	rollno =r;
	name =n;
	
	}
	
	void display (){
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void change(String str){
			college=str;
	}
		
		
		public static void main(String args[]){
			Student8 s1 = new Student8(33, "Pratik");
			Student8 s2 = new Student8(03, "Sumedh");
			
		s1.display();
		change("kkwagh");
		s2.display();
		
	}
}