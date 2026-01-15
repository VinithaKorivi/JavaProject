package OOPExPrograms;

class Person {
    Person() {
        System.out.println("Person Constructor");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student Constructor");
    }
}

public class ConsInherSuper {
    public static void main(String[] args) {
        new Student();
    }
}
