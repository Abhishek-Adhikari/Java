public class Static {
	public static void main(String[] args) {
		E obj1 = new E();
		E obj2 = new E();
		E obj3 = new E(); 
		System.out.println(obj1.code);
		System.out.println(obj2.code);
		System.out.println(obj3.code);
		obj3.change();
		System.out.println(obj1.code);
		System.out.println(obj2.code);
		System.out.println(obj3.code);
	}
}
