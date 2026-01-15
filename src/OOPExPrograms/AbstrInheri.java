package OOPExPrograms;

abstract class TV {
    abstract void display();
}

class LED extends TV {
    void display() {
        System.out.println("LED Display");
    }
}

class OLED extends TV {
    void display() {
        System.out.println("OLED Display");
    }
}

public class AbstrInheri {
    public static void main(String[] args) {
        TV t1 = new LED();
        TV t2 = new OLED();
        t1.display();
        t2.display();
    }
}
