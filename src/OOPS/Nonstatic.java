package OOPS;
class Nonstatic 
{
	int a=30;
	int s=60;
	public static void main(String[] args) 
	{
		Nonstatic g1=new Nonstatic();
		System.out.println(g1.a);
		System.out.println(g1.s);
		g1.a=200;
		g1.s=300;
		System.out.println(g1.a);
		System.out.println(g1.a);
        Nonstatic g2=new Nonstatic();
		System.out.println(g2.a);
		System.out.println(g2.s);
		g2.a=400;
		g2.s=600;
		System.out.println(g2.a);
		System.out.println(g2.s);
		Nonstatic g3=new Nonstatic();
		g3.a=800;
		g3.s=900;
		System.out.println(g3.a);
		System.out.println(g3.s);

	}
}
