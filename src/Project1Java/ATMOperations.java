package Project1Java;

import java.util.Scanner;

import java.util.Scanner;

public class ATMOperations {

    private User user;
    private TransactionHistory history;

    public ATMOperations(User user) {
        this.user = user;
        this.history = new TransactionHistory();
    }

    public void showMenu() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");   // NEW OPTION
            System.out.println("6. Quit");            // shifted to 6
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    history.showHistory();
                    break;

                case 2:
                    withdraw(sc);
                    break;

                case 3:
                    deposit(sc);
                    break;

                case 4:
                    transfer(sc);
                    break;

                case 5:
                    checkBalance();   // NEW METHOD
                    break;

                case 6:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (user.withdraw(amount)) {
            history.addTransaction("Withdraw: ₹" + amount);
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        user.deposit(amount);
        history.addTransaction("Deposit: ₹" + amount);
        System.out.println("Deposit Successful!");
    }

    private void transfer(Scanner sc) {
        System.out.print("Enter Receiver Account Number: ");
        String receiver = sc.next();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (user.withdraw(amount)) {
            history.addTransaction("Transfer to " + receiver + ": ₹" + amount);
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // 🔥 NEW METHOD
    private void checkBalance() {
        System.out.println("Current Balance: ₹" + user.getBalance());
    }
}