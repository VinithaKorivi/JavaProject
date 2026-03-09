package Project1Java;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to ATM Machine =====");

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        User user = new User("vinitha123", "1234", 50000);

        if (user.validate(userId, pin)) {
            System.out.println("Login Successful!\n");

            ATMOperations operations = new ATMOperations(user);
            operations.showMenu();

        } else {
            System.out.println("Invalid User ID or PIN!");
        }

        sc.close();
    }
}