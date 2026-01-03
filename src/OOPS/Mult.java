package OOPS;
import java.util.Scanner;
class  Mult
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
		int mul;
		for (int i=1;;i++)
		{
		 mul=a*i;	
		System.out.println("multiplication of a"+"is"+"="+(mul));
		}
	}
}
