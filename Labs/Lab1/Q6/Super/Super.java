//SUPER
class This {
	String name = "ram";
}

class That extends This {
	String name = "hari";
	
	void display() {
		System.out.println("super: " + (super.name));
	}
}



