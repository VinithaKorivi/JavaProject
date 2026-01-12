package PracticeMulThreadPrograms;

public class ExTryCatchFinally {

	public static void main(String[] args) {
   try {
	   int a=30,b=0;
	   System.out.println(a/b);
   }catch(ArithmeticException e) {
	   System.out.println("can't divide by zero");
   }finally {
	   System.out.println("Finally block executed");
   }
   System.out.println("Program continues");
	}

}
