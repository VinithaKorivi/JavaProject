package OOPS;

public class ConstructorOverloading {
	public ConstructorOverloading(){
	this(10);
		System.out.println("all these executed by  no arg constr");
	}
	public ConstructorOverloading(int i){
		
//		this();
		System.out.println("this is constructor");
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		ConstructorOverloading v=new ConstructorOverloading();
	}

}
