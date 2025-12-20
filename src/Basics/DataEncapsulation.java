package Basics;

public class DataEncapsulation {
    private int x;
    private String name;
   public int get() {
	return x;
   }
   public void set(int x) {
	   this.x=x;
   }
   public String get1() {
	   return name;
   }
   public void set(String name) {
	   this.name=name;
   }
	public static void main(String[] args) {
		DataEncapsulation d=new DataEncapsulation();
		System.out.println(d.get());
		d.set(15);
		System.out.println(d.get());
		System.out.println(d.get1());
		d.set("durga");
		System.out.println(d.get1());
	}

}
