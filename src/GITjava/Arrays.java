package GITjava;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num =sc.nextInt();	
		System.out.println("your entered no is "+num);
		int [] a= {10,20,30,40,50};
		
		for(int a1:a) {
			System.out.println(a1);
		}

	}

}
