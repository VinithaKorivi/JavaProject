package OOPS;
import java.util.Scanner;
class Twosc
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int res=a+b;
        System.out.println(res);
		System.out.println("sum="+res);
		System.out.println(a+"+"+b+"="+res);
	}
}
