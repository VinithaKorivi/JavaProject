package InterThreads;
import java.util.concurrent.locks.ReentrantLock;
public class ThreadCount extends ReentrantLock {
	public Thread getOwnerPublic() {
		   return super.getOwner();
	   }

	public static void main(String[] args) throws InterruptedException {
	 ReentrantLock l=new ReentrantLock(true);
	 l.lock();
	 l.lock();
    System.out.println(l.isLocked());
    System.out.println(l.getHoldCount());
    System.out.println(l.isHeldByCurrentThread());
    System.out.println(l.getQueueLength());
   System.out.println(l.hasQueuedThreads());
   System.out.println(l.isFair());
   ThreadCount n=new ThreadCount();
   System.out.println(n.getOwnerPublic());
   l.unlock();
	}

}
