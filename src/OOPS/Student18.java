package OOPS;
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class Student18 {

	public static void main(String[] args) {
		Person p=new Person("vinni",23 );
		System.out.println(p.name);
		System.out.println(p.age);
	}

}
