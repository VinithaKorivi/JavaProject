package InnerClasses;

public class LocalMethodInner {
	static int Z=56789;
	public void m1() {
		int r=70;
		class Inner{
			public void sum(int x,int y) {
				System.out.println(r);
				System.out.println(Z);
				System.out.println("The sum is "+x+y);
			}
		}
		Inner u=new Inner();
		u.sum(10,20);
		u.sum(100,200);
		u.sum(1000,2000);
	}

	public static void main(String[] args) {
		LocalMethodInner t=new LocalMethodInner();
		t.m1();
	}

}
