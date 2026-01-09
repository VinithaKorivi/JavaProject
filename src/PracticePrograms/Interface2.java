package PracticePrograms;

interface Order {
    double GST = 0.18; 

    void placeOrder(double amount);
    void cancelOrder();

    default double applyGST(double amount) {
        return amount + (amount * GST);
    }

    static void terms() {
        System.out.println("Terms: GST applicable. No returns after 7 days.");
    }
}

interface Shipping extends Order {
    void ship(String address);
    default boolean validateAddress(String address) {
        return address != null && address.length() >= 10;
    }
}

class StandardShipping implements Shipping {
    @Override
    public void placeOrder(double amount) {
        double finalAmt = applyGST(amount);
        System.out.println("Standard Order placed: Amount with GST = " + finalAmt);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Standard Order cancelled within 24 hours.");
    }

    @Override
    public void ship(String address) {
        if (validateAddress(address)) {
            System.out.println("Standard Shipping to: " + address);
        } else {
            System.out.println("Invalid Address for Standard Shipping.");
        }
    }
}

class ExpressShipping implements Shipping {
    @Override
    public void placeOrder(double amount) {
        double extra = amount * 0.10; // express delivery fee
        double finalAmt = applyGST(amount + extra);
        System.out.println("Express Order placed: Amount with fees & GST = " + finalAmt);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Express Order cannot be cancelled after packaging.");
    }

    @Override
    public void ship(String address) {
        if (validateAddress(address)) {
            System.out.println("Express Shipping dispatched to: " + address);
        } else {
            System.out.println("Invalid Address for Express Shipping.");
        }
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Order.terms();

        Shipping standard = new StandardShipping();
        standard.placeOrder(2000);
        standard.ship("Hyderabad, Telangana");
        standard.cancelOrder();

        System.out.println("----------------------");

        Shipping express = new ExpressShipping();
        express.placeOrder(3500);
        express.ship("Vizag, AP");
        express.cancelOrder();
    }
}
