//FINAL
class A {
	final int a = 5;
	
	A(int data) {
		System.out.println("this.a = data , is not possible as we cannot assign a value to final variable");
	}
	
	A() {
	
	}
}

class TestClass extends A {
	final void a() {
		System.out.println("We can't override this method");
	}
}

