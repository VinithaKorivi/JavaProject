package RECPrograms;
import java.util.Scanner;
class Leap 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		if ((n%400==0) ||(n%4==0&&n%100!=0))
		{
	    System.out.println("is leap year");
		}
		else
		{
			 System.out.println("is not leap year");
	}
}
}