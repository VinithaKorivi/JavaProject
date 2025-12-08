package InterThreads;
class Setting extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				
			}
		
	}
}
public class DaemonSetting {

	public static void main(String[] args) {
		System.out.println("Main thread, non daemon thread stops daemon thread execution");
		Setting t=new Setting();
		t.setDaemon(true);
		t.start();
		
	}

}
