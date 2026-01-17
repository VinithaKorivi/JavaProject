package OOPExPrograms;


class Animal5 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog5 extends Animal5 {
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperKInher {
    public static void main(String[] args) {
        new Dog5().sound();
    }
}
