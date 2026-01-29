package Packages;

public class ToStringMet {
	String name;
	int rollno;
	ToStringMet(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public void wish() {
		System.out.println(name+"......"+rollno);
	}

	public static void main(String[] args) {
		ToStringMet s=new ToStringMet("vini",45);
		ToStringMet s1=new ToStringMet("Nandu",48);
		System.out.println(s);
		System.out.println(s1);
		s.wish();
		s1.wish();
	}

}
