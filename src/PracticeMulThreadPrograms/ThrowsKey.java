package PracticeMulThreadPrograms;

public class ThrowsKey {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("this is First throws");
        dostuff();
		}
	public static void dostuff() throws InterruptedException {
		System.out.println("this is second throws");
		domorestuff();
	}
	public static void domorestuff() throws InterruptedException {
		System.out.println("Throws keyword");
		Thread.sleep(2000);
	}
}
