package PracticePrograms;
class BankAccount{
	 private String accountholder;
     private String accountnumber;
     private double balance;
     private int pin;
     
     public BankAccount(String accountholder,String accountnumber, double initialbalance, int pin) {
    	 this.accountholder=accountholder;
    	 this.accountnumber=accountnumber;
    	 this.pin=pin;
    	 
    	 if(initialbalance>=0) {
    		 this.balance=initialbalance;
    	 }
    	 else {
    		 System.out.println("initial balance can't be negative");
    		 this.balance=0;
    	 }
     }
     public double getbalance(int pin) {
    	 if(this.pin==pin) {
    		 return balance;
    	 }else {
    		 System.out.println("incorrect pin access denied");
    		 return -1;
    	 }
     }
   public void deposit(double amount) {
	   if(amount<0) {
		   System.out.println("deposit amount must be positive");
		   return;
	   }
	   balance+=amount;
	   System.out.println("deposited: "+amount+",New balance="+balance);
   }
   public void withdraw(double amount, int pin) {
	   if(this.pin!=pin) {
		   System.out.println("incorrect pin! Transaction failed");
		   return;
	   }
	   if(amount<=0) {
		   System.out.println("withdrawal amount must be positive");
		   return;
	   }
	   if(amount>balance) {
		   System.out.println("insufficient balance");
	   }
	   balance-=amount;
	   System.out.println("withdrawn : "+amount+", remaining balance= "+balance);
   }
}
public class DataHiding {

	public static void main(String[] args) {
		BankAccount bc=new BankAccount("Vinitha","147864785",5000.0,123456789);
		System.out.println(	bc.getbalance(123456789));
		bc.deposit(100000);
		bc.getbalance(123456789);
		bc.withdraw(2000.0,123456789);
		System.out.println("Remaining balance ="+	bc.getbalance(123456789));
   	}
}
