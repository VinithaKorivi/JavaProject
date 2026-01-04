package OOPS;
class Swap 
{
	public static void main(String[] args) 
	{ 
		int a=10;
		int b=20;
		System.out.println("a value is"+a);
		System.out.println("a value is"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is"+a);
		System.out.println("a value is"+b);
	}
}
