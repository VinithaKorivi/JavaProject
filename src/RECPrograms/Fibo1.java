package RECPrograms;
import java.util.Scanner;
class Fibo1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (;c<n ;)
		{
		  c=a+b;
		  a=b;
		  b=c;
		if (c==n)
		{
			System.out.println(n+"is fibonaci");
		}
		else
		{
		 System.out.println(n+"is not a fibonacci value");
		}
		}
	}
}


