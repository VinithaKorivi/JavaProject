package PracticePrograms;

abstract class Payment {
 private double amount;
 private String customer;

 Payment(double amount, String customer) {
     this.amount = amount;
     this.customer = customer;
 }
 abstract boolean validate();
 abstract void process();

 void printReceipt() {
     System.out.println("Receipt:");
     System.out.println("Customer: " + customer);
     System.out.println("Amount: $" + amount);
     System.out.println("----------------------------");
 }
}

class CreditCardPayment extends Payment
{
 private String cardNumber;

 CreditCardPayment(double amount, String customer, String cardNumber) {
     super(amount, customer);
     this.cardNumber = cardNumber;
 }

 @Override
 boolean validate() {
     return cardNumber != null && cardNumber.length() == 16;
 }

 @Override
 void process() {
     System.out.println("Processing credit card payment...");
 }
}

class UpiPayment extends Payment 
{
 private String upiId;

 UpiPayment(double amount, String customer, String upiId) {
     super(amount, customer);
     this.upiId = upiId;
 }

 @Override
 boolean validate() {
     return upiId != null && upiId.contains("@");
 }

 @Override
 void process() {
     System.out.println("Processing UPI payment...");
 }
}

//Main class demo
public class AbstractCLASS {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment(5000, "Vinitha", "1234567890123456");
     Payment p2 = new UpiPayment(1500, "Ravi", "ravi@upi");

     handlePayment(p1);
     handlePayment(p2);
 }

 static void handlePayment(Payment p) {
     if (p.validate()) {
         p.process();
         p.printReceipt();
     } else {
         System.out.println("Payment validation failed!");
     }
 }
}
