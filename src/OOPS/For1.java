package OOPS;

import java.util.Scanner;

class For1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		for (int i=1;i<=n;i++)
		{
           System.out.println("get job soon");
		   if (i==10)
		    break;
		}
	}
}
