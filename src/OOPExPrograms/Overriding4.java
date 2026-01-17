package OOPExPrograms;
class Employee3 {
    double bonus() {
        return 2000.0;
    }
}

class Manager extends Employee3 {
    @Override
    double bonus() {
        return 5000.0;
    }
}

class Developer extends Employee3 {
    @Override
    double bonus() {
        return 4000.0;
    }
}

public class Overriding4 {
    public static void main(String[] args) {
        Employee3 e1 = new Manager();
        Employee3 e2 = new Developer();

        System.out.println("Manager Bonus: " + e1.bonus());
        System.out.println("Developer Bonus: " + e2.bonus());
    }
}
