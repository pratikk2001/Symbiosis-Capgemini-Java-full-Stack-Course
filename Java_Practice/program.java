
	class program{
	public static void main(String[] args) {
	
	int i;
	
	for(i=0;i<=20;i++){
	 switch(i){
	 
	 case(0): i += 5;
	 case(1): i += 2;
	 case(5): i += 5;
	 //case(3): i += 4;
	 
	 default: i+=4;
	 
	 }
	 System.out.println(i);
	}

  }	
}