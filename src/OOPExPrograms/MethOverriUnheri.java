package OOPExPrograms;

class Vehicle3 {
    void run() {
        System.out.println("Vehicle is moving");
    }
}

class Car3 extends Vehicle3 {
    @Override
    void run() {
        System.out.println("Car moves on road");
    }
}

public class MethOverriUnheri {
    public static void main(String[] args) {
        Vehicle3 v = new Car3();
        v.run();
    }
}
