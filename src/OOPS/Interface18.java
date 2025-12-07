package OOPS;

class P {
    P() {
        System.out.println(this.hashCode());
    }
}

class C extends P {
    C() {
        System.out.println(this.hashCode());
    }
}

public class Interface18 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.hashCode());
    }
}