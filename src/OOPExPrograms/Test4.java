package OOPExPrograms;

class Payment {
    void pay(String cardNo) {
        System.out.println("Paid using Card: " + cardNo);
    }

    void pay(long upiNo) {
        System.out.println("Paid using UPI: " + upiNo);
    }

    void pay(String wallet, double amount) {
        System.out.println("Paid using Wallet: " + wallet);
        System.out.println("Amount: " + amount);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay("4488-1223-5677");  
        p.pay(987654321L);       
        p.pay("Paytm", 999.50);  
    }
}
