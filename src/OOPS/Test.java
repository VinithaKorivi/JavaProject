package OOPS;

public class Test {
//   private static Test t=new Test();
	 private static Test t;
   private Test() {
	   System.out.println("this is private constructor of singleton class");
   }
   public static Test getIns() {
	   if(t==null) {
		   t=new Test();
	   }
	   return t;
   }
	public static void main(String[] args) {
		Test t1=Test.getIns();
		System.out.println(t1);
	}

}
