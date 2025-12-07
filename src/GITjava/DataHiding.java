package GITjava;
class Account {
    // Data Hiding using private variable
    private double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance safely
    public void deposit(double amount) {
        if (amount > 0)
        {
            balance += amount;
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
public class DataHiding {

	public static void main(String[] args) {
		
		        Account acc = new Account(5000);
		        acc.deposit(2000);
		        System.out.println("deposited amount " + 2000);
		        acc.withdraw(7000);
		        System.out.println("Final Balance: " + acc.getBalance());
		    }
	}

