package RECPrograms;
import java.util.Scanner;
class Sub
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int sub=23;
		for (int i=1;i<=n ;i--)
		{
         sub=sub-i;
		}
		System.out.println(sub);
	}
}
