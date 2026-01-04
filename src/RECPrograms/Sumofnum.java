package RECPrograms;
import java.util.Scanner;
class Sumofnum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
         sum=sum+i;
		}
		System.out.println(sum);
	}
}
