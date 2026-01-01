package OOPS;

public class Command {
	
	 protected  void Vinitha() {
		  System.out.println("This is the protected method of other package");
	  }


	public static void main(String[] args) {
		System.out.println("Hi");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
