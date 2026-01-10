package PracticePrograms;
class Bank{
	private double balance;
	public void deposit(double amt) {
		balance+=amt;
	}
	public double getbalance() {
		return balance;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.deposit(5000);
	    System.out.println(b.getbalance());
	}

}
