package PracticeMulThreadPrograms;

public class Finally {

	public static void main(String[] args) {
   try {
	   System.out.println(10/2);
	   System.out.println(10/0);
   }catch (Exception e) {
	   System.out.println("i am catch block i will only execute when exception rises,There is an exception in your code please check");
   }finally {
	   System.out.println("i am finally block i will always execute irrespective of try and catch blocks");
   }
	}

}
