//Write a program to find sum and difference of two numbers using command line arguments.

public class CommandLineArgs {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("sum= "+(num1 + num2));
		System.out.println("difference= "+(num1 - num2));
	}
}
