package PatternPrograms;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=3;j++) {
	    		System.out.print(j+" "+i+" ");
	    	}
	    	System.out.println();
	}
	}

}
