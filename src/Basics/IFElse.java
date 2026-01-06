package Basics;

public class IFElse {

	public static void main(String[] args) {
		int balance=5000;
		int withdraw=2000;
		if(withdraw<=balance) {
        if(withdraw<=3000) {
        	System.out.println("withdraw successful");
        }
        else {
        	System.out.println("withdrawel limit exceedeed");
        }}
        else {System.out.println("insufficient balnce to withdraw"); }
		System.out.println("=====================");
		
		int year=2028;
		if((year%400==0)||(year%4==0 &&year%100!=0)) {System.out.println("leap year");}
		else System.out.println("not leapyear");
		System.out.println("=========================");
		
		String username="vinitha";
		String password="1234";
		if(username.equals("admin") && password.equals("1234")) {System.out.println("login successful");}
		else System.out.println("login failed");
	}
}

