package Multithreading;
class Block{
	public void wish(String name) {
		synchronized(this) {
			for(int i=1;i<=3;i++) {
			System.out.print("Good Morning");
			}
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
class Test7 extends Thread{
	Block b;
	String name;
	Test7(Block b, String name){
		this.b=b;
		this.name=name;
	}
	public void run() {
		b.wish(name);
	}
}
public class SynchroniBlock {

	public static void main(String[] args) {
		Block b=new Block();
		Test7 t=new Test7(b,"Dhoni");
		Test7 t1=new Test7(b,"Virat");
		t.start();
		t1.start();
	}

}
