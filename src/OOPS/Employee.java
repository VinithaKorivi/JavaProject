package OOPS;


class Employee {
    int eid;
    String name;
    double salary;

    Employee(int id) {
        eid = id;
    }

    Employee(int id, String n) {
        eid = id;
        name = n;
    }

    Employee(int id, String n, double sal) {
        eid = id;
        name = n;
        salary = sal;
    }

    void show() {
        System.out.println(eid + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(2, "Kavya");
        Employee e3 = new Employee(3, "Bala", 45000);
        e1.show();
        e2.show();
        e3.show();
    }
}
