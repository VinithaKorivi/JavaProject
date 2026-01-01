package RECPrograms;
import java.util.Scanner;
class Odd 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int f=scn.nextInt();
		if (f%2!=0)
		{
        System.out.println("entered number"+f+"is"+"odd number");
	}
	else
		{
		System.out.println("entered number"+f+"is"+"even number");
		}
		
	}
	}