package WrapperClasses;

import java.util.ArrayList;

class STRING{
	String name;
	int rollno;
	STRING(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString() {
		return "Nmae of the student "+name+" and roll no is"+rollno;
	}
}
public class ToSTRINGMeth {

	public static void main(String[] args) {
		STRING s=new STRING("vini", 101);
		System.out.println(s);
		Integer I=new Integer(10);
		System.out.println(I);
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l);
		ToSTRINGMeth m=new ToSTRINGMeth();
		System.out.println(m);
	}

}
