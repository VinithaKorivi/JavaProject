package OOPExPrograms;

class Animal2 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog2 extends Animal2 {
    void bark() { System.out.println("Dog barks"); }
}

class Cat extends Animal2 {
    void meow() { System.out.println("Cat meows"); }
}

public class Hierarchical {
    public static void main(String[] args) {
        new Dog2().bark();
        new Cat().meow();
    }
}
