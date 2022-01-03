import java.io.IOException;

class Demo {
	public static void main(String[] args) throws InterruptedException {
		try {
			int num = Integer.parseInt(args[0]);
			
			switch(num) {
				case 1:
					throw new ArithmeticException();

				case 2:
					throw new ArrayIndexOutOfBoundsException();

				case 3:
					throw new InterruptedException();	
			}
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Provide some argument");
		}
		finally {
			System.out.println("this executes in any case.");
		}
		System.out.println("testing after try...");

	}
}