package PracticeMulThreadPrograms;

public class AllExceptionKeywords {
 static void validate(int num) {
	 if(num<0) {
		 System.out.println("Negative numbers are not allowed");
	 }
	 System.out.println("given no is valid: "+num);
 }
	public static void main(String[] args) {
    try {
    	validate(5);
    }catch(Exception e) {
    	System.out.println("I caught you:"+e);
    }finally {
    	System.out.println("finally i got executed");
    }
    System.out.println("Program continues wait and see");
	}

}
