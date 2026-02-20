package Multithreading;

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amt) {
        System.out.println("Going to withdraw...");
        if (amount < amt) {
            try { wait(); } catch (Exception e) {}
        }
        amount -= amt;
        System.out.println("Withdraw completed");
    }

    synchronized void deposit(int amt) {
        amount += amt;
        System.out.println("Amount deposited");
        notify();
    }
}

public class InterThreCommu {
    public static void main(String[] args) {
        Customer c = new Customer();

        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();
    }
}