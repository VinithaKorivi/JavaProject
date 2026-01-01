package RECPrograms;
import java .util.Scanner;
class  Fibonacci2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
		int b=0;
		int c=1;
		int d=0;
		if (a==1)
		{
			System.out.println(0);
			return;
		}
		System.out.println(b+c);
		for (int f=1;f<=5 ;f++ )
		{
			d=b+c;
			System.out.println(d);
			b=c;
			c=d;
		}
		
	}
}
