package PracticeMulThreadPrograms;

public class TryWmulCatch {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		System.out.println("Division by zero");
	}catch(Exception e) {
		System.out.println("It is the parent exception class");
	}
		
		
		
		
		
//     try {
//    	 System.out.println(10/0);
//     }
//     catch(ArithmeticException e){
//    	 e.printStackTrace();
//    	 System.out.println(e.toString());
//    	 System.out.println(e.getMessage());
//    	 }
	}

}
