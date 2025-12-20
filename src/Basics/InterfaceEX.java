package Basics;
interface Bank{
	public void deposit(int amt);
	public void withdraw(double cash);
	public void checkbalance();
}
class SBI implements Bank{
	int balance;
	@Override
	public void deposit(int amt)
	{
	  	if(amt>0) {
	  		balance+=amt;
	  		System.out.println("Deposited amount into account is"+amt);
	 }}
	@Override
	 public void withdraw(double cash) {
	  		if(cash>balance) {
	  			System.out.println("insufficient amount");
	  		}
	  		else {
	  			balance-=cash;
	  			System.out.println("withdrawn amt is"+cash);
	  		}
	  		System.out.println("remaining balance="+balance);
	  	}
	@Override
	 public void checkbalance() {
		 System.out.println("the remaining balnce is="+balance);
	 }
	
	}

public class InterfaceEX  {

	public static void main(String[] args) {
	 Bank s=new SBI();
	 s.deposit(2000);
	 s. checkbalance();
	 s.withdraw(1000.0);
	 

	}

}
