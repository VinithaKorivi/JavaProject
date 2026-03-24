package Project1Java;

import java.util.ArrayList;

public class TransactionHistory {

    private ArrayList<String> transactions;

    public TransactionHistory() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void showHistory() {

        if (transactions.isEmpty()) {
            System.out.println("No Transactions Yet.");
        } else {
            System.out.println("\n===== Transaction History =====");
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }
}