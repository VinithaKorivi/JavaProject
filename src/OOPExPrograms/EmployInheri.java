package OOPExPrograms;

class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n; salary = s;
    }
}

class Manager1 extends Employee {
    String dept;

    Manager1(String n, double s, String d) {
        super(n, s);
        dept = d;
    }

    void show() {
        System.out.println(name + " | " + salary + " | " + dept);
    }
}

public class EmployInheri {
    public static void main(String[] args) {
        new Manager1("Alice", 75000, "HR").show();
    }
}
