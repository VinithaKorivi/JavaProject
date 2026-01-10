package PracticePrograms;
abstract class Gateway{
	
	abstract void authenticate();
	abstract void pay(double amount);
	
	public void getreceipt(double amount) {
		
		System.out.println("receipt generated for the amount"+amount);
	}
}
class Creditcard extends Gateway{
	@Override
	public void authenticate() {
		System.out.println("authenticating using bank otp,cvv,bank gateway ");
	}
	@Override
	public void pay(double amount) {
		authenticate();
		System.out.println("payment is processing via credit card");
		System.out.println("payment of $"+amount+"done using credit card");
		 getreceipt(amount);
	}
}
class Upipayment extends Gateway{
	@Override
	public void authenticate() {
		System.out.println("authenticating using upi payment  otp,cvv,bank gateway ");
	}
	@Override
	public void pay(double amount) {
		authenticate();
		System.out.println("payment is processing via UPI payment card");
		System.out.println("payment of $"+amount+"done using UPI Payment");
		 getreceipt(amount);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Gateway payment;
		payment=new Creditcard();
		payment.pay(700000);
		System.out.println("****************");
		payment=new Upipayment();
		payment.pay(500000);
	}

}
