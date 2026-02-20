package Multithreading;

class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreUsingJoin {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        t.start();
        t.join();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread after join");
        }
    }
}