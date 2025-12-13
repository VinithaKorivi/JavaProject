package WrapperClasses;
class Cat1{
	int j;
	Cat1(int j){
		this.j=j;
	}
}
class Dog1 implements Cloneable{
	Cat1 c;
	int i;
	Dog1(Cat1 c, int i){
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException{
		Cat1 c1=new Cat1(c.j);
		Dog1 d1=new Dog1(c1,i);
		return d1;
	}
}
public class DEEPCloning {

	public static void main(String[] args)  throws CloneNotSupportedException {
		Cat1 c=new Cat1(20);
		Dog1 d1=new Dog1(c,10);
		System.out.println(d1.i+"...."+d1.c.j);
		Dog1 d2=(Dog1)d1.clone();
		d2.i=5555;
		d2.c.j=33333;
		System.out.println(d1.i+"...."+d1.c.j);
		System.out.println(d2.i+"...."+d2.c.j);
	}

}
