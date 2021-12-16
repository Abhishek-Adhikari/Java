interface Characters {
	void eat();
}

interface Habitat {
	void adaptation();
}

abstract class Dog implements Characters, Habitat {
	public void eat() {
		System.out.println("eating");
	}
}

class Husky extends Dog {
	public void adaptation() {
		System.out.println("terrestrial");
	}
}