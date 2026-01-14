package OOPExPrograms;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // runtime polymorphism
        a.sound();
    }
}
