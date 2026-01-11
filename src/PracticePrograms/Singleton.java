package PracticePrograms;

public class Singleton {
   private static Singleton instance;
   private Singleton() {
	   System.out.println("Singleton instance created");
   }
   public static Singleton getinstance() {
	   if(instance==null) {
		   instance=new Singleton();
	   }
	   return instance;
   }
	public static void main(String[] args) {
		Singleton s1= Singleton.getinstance();
	   System.out.println(s1);
	}

}
