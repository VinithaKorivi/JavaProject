package GITjava;

public class Rethrowing {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			throw new NullPointerException();
		}
		finally {
			System.out.println("This is about rethrowing an exception");
		}

	}

}
