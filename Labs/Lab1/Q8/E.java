class E {
	static int counter = 0;   //static variable
	static String code = "original code";
	static void change() {   //static method
		code = "changed code";
	}
	
	E() {
		counter++;
		System.out.println(counter);
	}
}