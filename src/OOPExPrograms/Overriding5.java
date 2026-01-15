package OOPExPrograms;

class Vehicle {
    void speed() {
        System.out.println("Vehicle speed varies");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car speed: 120 km/hr");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike speed: 80 km/hr");
    }
}

public class Overriding5
{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.speed();
        v2.speed();
    }
}
