package OOPS;
class Ternary 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=30;
		int res=a>b? a:b;
		int res1=a<b? a:b;
		System.out.println(res);
		System.out.println(res1);
	}
}
class T1
{
	public static void main(String[] args)
	{
		int a=10;
		int b=30;
		System.out.println(a>b);
        System.out.println(!(a>b));
}
}