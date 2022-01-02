class OwnException extends ArithmeticException{
	public OwnException(String message){
		super(message);
	}
}

class ExceptionDemo {
	public static void main(String[] args) throws OwnException{
		int age = 120;
		if( age < 1 || age > 100) {
			throw new OwnException("Invalid entry.");
		}

	}
}