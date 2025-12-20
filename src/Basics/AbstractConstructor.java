package Basics;
abstract class Constr{
	int x;
	int y;
	int z;
	Constr(int x, int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
}
public class AbstractConstructor extends Constr {
	int rollno;
	AbstractConstructor(int x, int y, int z, int rollno){
		super(x,y,z);
		this.rollno=rollno;
	}
	public static void main(String[] args) {
	
		AbstractConstructor a=new AbstractConstructor(10,20,30,101);
		System.out.println(a.x+"  "+a.y+"  "+a.z+" "+a.rollno);
		Chi c=new Chi(8,9,5,"vinitha");
		c.m1();
	}

}
class Chi extends Constr{
	String name;
	Chi(int x, int y, int z, String name){
		super(x,y,z);
		this.name=name;
	}
	public void m1() {
		System.out.println(x+" "+y+"  "+z+" "+name);
	}
}



//abstract class Constr{
//	int x;
//	int y;
//	int z;
//}
//public class AbstractConstructor extends Constr {
//	int rollno;
//	AbstractConstructor(int x, int y, int z, int rollno){
//		this.x=x;
//		this.y=y;
//		this.z=z;
//		this.rollno=rollno;
//	}
//	public static void main(String[] args) {
//	
//		AbstractConstructor a=new AbstractConstructor(10,20,30,101);
//		System.out.println(a.x+"  "+a.y+"  "+a.z+" "+a.rollno);
//		Chi n=new Chi(1,2,3,"vini");
//		n.m1();
//	}
//
//}
//class Chi extends Constr{
//	String name;
//	Chi(int x, int y, int z, String name){
//		this.x=x;
//		this.y=y;
//		this.z=z;
//		this.name=name;
//	}
//	public void m1() {
//		System.out.println(x+" "+y+"  "+z+" "+name);
//	}
//}
