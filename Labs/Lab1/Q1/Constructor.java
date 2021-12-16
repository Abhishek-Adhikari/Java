public class Constructor {
	public static void main(String[] args) {
		ConstructorDemo cons = new ConstructorDemo(3,"ram"); // parameterized constructor
		System.out.println("cons=>" + cons.name + "'s roll no is "+ cons.roll);
		ConstructorDemo cons1 = new ConstructorDemo(); //default constructor
		ConstructorDemo cons2 = new ConstructorDemo(cons); // copy constructor
		System.out.println("cons1=>" + cons1.name + "'s roll no is "+ cons1.roll);
		System.out.println("cons2=>" + cons2.name + "'s roll no is "+ cons2.roll);
	}
}