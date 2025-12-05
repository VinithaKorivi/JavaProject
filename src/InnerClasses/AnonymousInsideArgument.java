package InnerClasses;

public class AnonymousInsideArgument {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			       public void run() {
			    	   for(int i=0;i<=5;i++) {
			    		   System.out.println("Inside argument anonymous child class");
			    	   }
			       }
		           }).start();
		for(int i=0;i<=5;i++) {
 		   System.out.println("main method");
 	   }
	}

}
