package OOPS;
class Inherit{
	public void m1() {
		System.out.println("This is the m1 method of Child class");
	}
	public void m2() {
		System.out.println("This is the m2 method of Child class");
	}
}
public class InheritenceConcept extends Inherit{

	public static void main(String[] args) {
		System.out.println("this is the main method");
		InheritenceConcept i=new InheritenceConcept();
		i.m1();
		i.m2();
	}

}
