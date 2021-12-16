abstract class Animal {
	
	abstract void eat();
	
}

abstract class Dog extends Animal {	
	void jump() {
		System.out.println("jumping");
	}
}

class Husky extends Dog {
	void eat() {
	System.out.println("dog eats meat..");
}

}

class Cat extends Animal {
	void eat() {
		System.out.println("cats eat fish.");
	}
}