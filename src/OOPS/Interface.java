package OOPS;
class A{
	String name;
	int age;
	double height;
	int weight;
	A(String name, int age, double height, int weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}
class B{
	int rollno;
	int id;
	B(int rollno, int id)
	{
		super();
		this.rollno=rollno;
		this.id=id;
	}
}
public class Interface{
	public static void main(String[] args) {
		B b=new B( 101, 8888);
		System.out.println(b.rollno);
		System.out.println(b.id);
		A a =new A("vinni",24,1.7,89);
		System.out.println(a.name+ "  "+ a.age + "   " + a.height + " "+ a.weight);
		
		}
		
		
	}
