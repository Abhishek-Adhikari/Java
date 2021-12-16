public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push("abc");
		stack.display();
		stack.push("def");
		stack.display();
		stack.push("ghi");
		stack.display();
		System.out.println(stack.pop());
	}
}
