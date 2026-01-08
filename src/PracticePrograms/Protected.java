package PracticePrograms;

import PatternPrograms.Test;

class Parent{
	protected static int z=100;

}
public class Protected extends Test{

	public static void main(String[] args) {
//     System.out.println(z);
     PUBLICAccessMod b=new PUBLICAccessMod();
     b.m2();
     Protected p=new Protected();
//     p.m2();
   p.method();
	}
}
