package OOPS;
import java.util.*;
class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}
class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}
public class CustException   {

	public static void main(String[] args)  {
   Scanner scn=new Scanner(System.in);
   System.out.println("Enter the Groom age");
     int age=scn.nextInt();
     if(age>60) {
    	 throw new TooYoungException("you are too young to marry plase come after some years");
     }
     else if(age<18) {
    	 throw new TooOldException("you are too old to marry you missed your marriagable age");
     }
     else {
    	 System.out.println("you will get matck details by email");
     }
	}

}
