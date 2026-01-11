package PracticePrograms;
class Paayment{
	void pay() {
		System.out.println("General payment processing");
	}
}
class UPI extends Paayment{
	@Override 
	public void pay() {
		System.out.println("payment is processing via UPI process");
	}
}
class Credit extends Paayment{
	@Override
	public void pay() {
		System.out.println("payment is processing via Credit card");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Paayment p;
        p=new UPI();
        p.pay();
        p=new Credit();
        p.pay();
	}

}
