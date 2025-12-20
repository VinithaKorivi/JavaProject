package Basics;

public class FinalVariables {
   final int y=20;
  final  static int z=30;
	public static void main(String[] args) {
		FinalVariables v=new FinalVariables();
		final int x=10;
		System.out.println(x);
		System.out.println(v.y);
		System.out.println(z);
		FinalVariables v1=new FinalVariables();
//		v1.y=100;
//		FinalVariables.z=200;
		System.out.println(x);
		System.out.println(v1.y);
        System.out.println();        
	}

}
