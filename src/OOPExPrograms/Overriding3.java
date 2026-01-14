package OOPExPrograms;

class Payment4 {
    void pay(double amount) {
        System.out.println("Paying using default method: " + amount);
    }
}

class CardPayment extends Payment4 {
    @Override
    void pay(double amount) {
        System.out.println("Paid using Credit/Debit Card: " + amount);
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        Payment4 p = new CardPayment();
        p.pay(2500.50);
    }
}
