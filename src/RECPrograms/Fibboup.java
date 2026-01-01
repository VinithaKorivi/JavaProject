package RECPrograms;

import java.util.Scanner;
class Fibboup 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
        System.out.println(c);
		System.out.println(a+b);
		for (;;)
		{
			c=a+b;
			if (c>n)
			{
			return;
			}
            System.out.println(c);
			a=b;
			b=c;

		}
	}
}
