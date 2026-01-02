package OOPS;
class Shortcircuit 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		boolean res1=a<b||b>a;
		boolean res2=a>b||b>a;
		boolean res3=a<b||b<a;
		boolean res4=a>b||b<a;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}
