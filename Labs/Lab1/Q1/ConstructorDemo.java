class ConstructorDemo {
 
	 int roll;
  	 String name;
	ConstructorDemo() {
		System.out.println("default constructor");
	}
	
	ConstructorDemo(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	ConstructorDemo(ConstructorDemo cons) {
		roll = cons.roll;
		name = cons.name;
	}
}