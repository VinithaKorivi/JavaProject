package OOPExPrograms;

class A {
    void showA() {
        System.out.println("Inside A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Inside B");
    }
}

public class  SingleLevel{
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
