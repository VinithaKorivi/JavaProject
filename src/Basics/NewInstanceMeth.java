package Basics;
class Student{
	
}
class Employee{
	
}
public class NewInstanceMeth  {

	public static void main(String[] args) throws Exception {
		Object o=Class.forName(args[0]).newInstance();
		System.out.println("Object created for  "+o.getClass().getDeclaredConstructor().getName());

	}

}
