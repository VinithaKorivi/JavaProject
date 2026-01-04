package RECPrograms;
import java.util.Scanner;
class Snakep 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int num;
		for (int i=1;i<=n ;i++ )
		{
			if(i%2!=0)
			{
			 num=((i-1)*n)+1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+"\t");
					num++;
			}
			}
			else
			{
			    num=i*n;
				for(int j=1;j<=n;j++)
				{
					System.out.print(num+"\t");
					num--;
				}
				
			}
			System.out.println( );
		}
	}
}


