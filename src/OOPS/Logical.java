package OOPS;
class Logical 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		boolean resa=a<b&&b>a;
		boolean resb=a<b&&b<a;
		boolean resc=a>b&&b>a;
		boolean resd=a>b&&b<a;
		System.out.println(resa);
        System.out.println(resb);
		System.out.println(resc);
        System.out.println(resd);

	}
}
