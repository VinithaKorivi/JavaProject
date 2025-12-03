package GITjava;

public class MultiCatch {

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



//public class MultiCatch {
//	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e){
//			throw new NullPointerException();
//		}
//	}
//}
