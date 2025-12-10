package InterThreads;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLo extends ReentrantLock {

    public Thread getOwnermet() {
        return super.getOwner();  // now accessible
    }

    public static void main(String[] args) {
        ReEntrantLo l = new ReEntrantLo();   // use subclass object
        l.lock();
        System.out.println(l.getOwnermet());
        l.unlock();
    }
}
