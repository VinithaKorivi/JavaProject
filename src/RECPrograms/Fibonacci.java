package RECPrograms;
import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number!");
		int a=scn.nextInt();
		int v=0;
        int b=1;
		int c=0;
		System.out.println(v+""+b);
		for (int l=1;l<=10 ;l++ )
		{
			c=v+b;
			System.out.println(c);
		v=b;
        b=c;
		}
	}
}
