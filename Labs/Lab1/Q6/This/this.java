//Write a program to demonstrate use of this, super and final keywords.
//THIS

class This {
	int a ,b;
	public This() {
		
	}
	
	public This(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println("a= "+this.a);
		System.out.println("b= "+this.b);
	}
}


