package Basics;
import OOPS.Command;
class Protec extends Command{
	protected void show() {
		System.out.println("This is the protected method of current package");
	}
}
public class ProtectedMod extends Protec {

	public static void main(String[] args) {
		ProtectedMod p=new ProtectedMod();
		p.show();
		p.Vinitha();
	  Child d=new Child();
	  d.m1();

	}

}
 class Child extends Command {

    public void m1() {
        Child c = new Child();
        c.Vinitha();   
    }
}

