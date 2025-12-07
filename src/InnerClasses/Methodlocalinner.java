package InnerClasses;
class Tst{
	public void m1() {	
		class Inner{
			public void m2() {
				for(int i=0;i<=5; i++) {
					System.out.println("inner most class");
				}
			}
		}
		Inner i=new Inner();
		i.m2();
	}
}
public class Methodlocalinner {

	public static void main(String[] args) {
	 Tst t=new Tst();
	 t.m1();
	}

}
