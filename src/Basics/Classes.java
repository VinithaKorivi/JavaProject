package Basics;

	class Student3 {
	    String name;
	    int age;

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	public class Classes {
	    public static void main(String[] args) {

	        Student3 s1 = new Student3();

	        s1.name = "Vinitha";
	        s1.age = 20;

	        s1.display();
	    }
	}