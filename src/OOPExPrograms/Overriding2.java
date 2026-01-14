package OOPExPrograms;


class Bank {
    double rate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double rate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double rate() {
        return 7.2;
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI: " + b1.rate());
        System.out.println("HDFC: " + b2.rate());
    }
}

