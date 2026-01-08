package PracticePrograms;

public class ArithmeticOper {

	public static void main(String[] args) {
		int i = 1;
		int j = i++ + ++i + i++ + ++i;
		System.out.println(j);

		
		int a = 5;
		if(++a>5 && ++a>6) {
			System.out.println(a);
		}
		else {System.out.println(a);}
		
		
		System.out.println("============");
		int x=10;
		int y=20;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y);
	}

}
