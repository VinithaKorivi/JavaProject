package GITjava;

class Big extends Thread
{
	public void run() {
		System.out.println("start method");
	}
	public void run(int i) {
		System.out.println("run method");
	}

public class OverStart {

	public static void main(String[] args) {
	  Big t=new Big();
	  t.start();
	  t.run(9);
//	  Big w=new Big();
//	  w.run(2);
	}

}}
