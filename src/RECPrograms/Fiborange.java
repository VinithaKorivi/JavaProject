package RECPrograms;
import java.util.Scanner;
class Fiborange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter m value");
		int m=scn.nextInt();
		System.out.println("enter a n value");
		
		int n=scn.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		if(n==0)
			System.out.print(a+ " "+b);

		for (; ;)
		{
			c=a+b;
			if (c>n)
			{
             break;
			}
			if (c<n && c>m)
			{
				System.out.println(c);
			}
			a=b;
			b=c;
		
		
	}
}
}