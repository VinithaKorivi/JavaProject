package OOPExPrograms;
class Employee {
    double bonus() {
        return 2000.0;
    }
}

class Manager extends Employee {
    @Override
    double bonus() {
        return 5000.0;
    }
}

class Developer extends Employee {
    @Override
    double bonus() {
        return 4000.0;
    }
}

public class Overriding4 {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Manager Bonus: " + e1.bonus());
        System.out.println("Developer Bonus: " + e2.bonus());
    }
}
