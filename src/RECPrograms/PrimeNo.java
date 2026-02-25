package RECPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter your number");
    int n=scn.nextInt();
    int count=0;
    for(int i=1;i<=n;i++) {
    	if(n%i==0) {
    		count++;
    	}
    }
    if(count==2) {
    	System.out.println("given no "+n+" is prime no");
    }
    else {
    	System.out.println("given no "+n+" is prime not a prime");
    }
	}

}
