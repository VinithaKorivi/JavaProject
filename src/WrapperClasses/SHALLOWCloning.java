package WrapperClasses;
class Cat{
	int j;
	Cat(int j){
		this.j=j;
	}
}
class Dog implements Cloneable{
	Cat c;
	int i;
	Dog(Cat c, int i){
		this.c=c;
		this.i=i;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class SHALLOWCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c=new Cat(20);
		Dog d=new Dog(c,10);
		System.out.println(d.i+"...."+d.c.j);
		Dog d2=(Dog)d.Clone();
		d2.i=8888;
		d2.c.j=6666;
		System.out.println(d2.i+"...."+d2.c.j);
		System.out.println(d.i+"...."+d.c.j);
	}

}
