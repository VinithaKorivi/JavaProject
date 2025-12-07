package GITjava;

public class Anonymous {

	public static void main(String[] args) {
		m1(new int[] {20,30,50,65,80,4,9,6,5,4,7,7});
		
	}
		public static void m1(int [] x) {
			int count=0;
			for(int x1:x) {
				System.out.println(x1);
				count++;
			}
			System.out.println("The sum is ="+count);
		}

}
