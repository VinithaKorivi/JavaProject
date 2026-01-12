package PracticeMulThreadPrograms;

public class Throws {
// static void riskymethod() throws InterruptedException {
//	 Thread.sleep(1000);
//	 System.out.println("completed risky method");
// }
	static void checkage(int age) {
		if(age<18) {
		 throw new ArithmeticException("Not eligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) throws InterruptedException {
//		riskymethod();
//		System.out.println("main method completed");
		checkage(5);
	}

}
