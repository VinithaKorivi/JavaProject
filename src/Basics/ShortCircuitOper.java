package Basics;

public class ShortCircuitOper {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println(x&y);
		System.out.println(x|y);
		if(++x<10 && ++y>15) {
			x++;
		}
		else { y++; }
		System.out.println(x+"   "+y);
	}

}
