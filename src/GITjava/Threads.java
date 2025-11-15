package GITjava;

public class Threads {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e);
		}
	}

}

//concept of Rethrowing Exception



//public class Threads {
//	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e){
//			throw new NullPointerException();
//		}
//	}
//}
