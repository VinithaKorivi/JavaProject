package Multithreading;

import java.util.concurrent.*;

class Task implements Runnable {
    public void run() {
        System.out.println("Executed by: " +
                Thread.currentThread().getName());
    }
}

public class Executers {
    public static void main(String[] args) {
        ExecutorService service =
                Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            service.execute(new Task());
        }

        service.shutdown();
    }
}