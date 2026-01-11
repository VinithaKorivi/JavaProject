package PracticePrograms;
class Account{
	String holder;
	Account(String holder){
		this.holder=holder;
		System.out.println("Account created for="+holder);
	}
}
class Savings extends Account{
	double interest;
	Savings(double interest,String holder){
		super(holder);
		this.interest=interest;
		System.out.println("Interest rate="+interest);
	}
}
public class CalltoSuper2 {

	public static void main(String[] args) {
		new Savings(6.50,"Vinitha");

	}

}
