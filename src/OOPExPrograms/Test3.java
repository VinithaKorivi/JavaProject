package OOPExPrograms;

class Invoice {
    void generate(String customer) {
        System.out.println("Invoice for: " + customer);
    }

    void generate(String customer, double amount) {
        System.out.println("Invoice for: " + customer);
        System.out.println("Amount: " + amount);
    }

    void generate(String customer, double amount, String status) {
        System.out.println("Invoice for: " + customer);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.generate("Alice");
        i.generate("Bob", 4500.75);
        i.generate("Chris", 7600.90, "PAID");
    }
}
