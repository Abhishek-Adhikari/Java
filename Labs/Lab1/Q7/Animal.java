interface Animal {
	void bodyColor();
	default void eat() { //use of default method helps to enable method body
		System.out.println("eating");
	}
}

class Cow implements Animal {
	public void bodyColor() {
		System.out.println("white");
	}
}