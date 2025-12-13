package WrapperClasses;

public class CLONING implements Cloneable {
    int i=10;
    int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CLONING c=new CLONING();
		System.out.println(c.i+"..."+c.j);
		CLONING c1=(CLONING)c.clone();
		c1.i=888;
		c1.j=9999;
		System.out.println(c.i+"..."+c.j);
		System.out.println(c1.i+"..."+c1.j);
		System.out.println(c.i+"..."+c.j);
	}

}
