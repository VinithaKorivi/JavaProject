package PatternPrograms;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=5;j++) {
	    		System.out.printf("%2d ",(i*j));
	    	}
	    	System.out.println();
	}
	}

}
