package RECPrograms;
import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		if ((n%400==0) ||(n%4==0&&n%100==0))
		{
	    System.out.println("is prime");
		}
		else
		{
			 System.out.println("is not prime");
	}
}
}