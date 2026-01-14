package OOPExPrograms;

class A1 {
    void m1() { System.out.println("A method"); }
}

class B1 extends A1 {
    void m2() { System.out.println("B method"); }
}

class C extends B1 {
    void m3() { System.out.println("C method"); }
}

public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1(); obj.m2(); obj.m3();
    }
}
