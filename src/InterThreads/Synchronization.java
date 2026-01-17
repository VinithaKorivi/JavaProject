package InterThreads;

class Buffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        // If data already present, wait for consumer
        while (hasData) {
            wait();
        }
        System.out.println("Producer produced: " + value);
        data = value;
        hasData = true;
        notify(); // signal consumer to consume
    }

    public synchronized int consume() throws InterruptedException {
        // If no data, wait for producer
        while (!hasData) {
            wait();
        }
        System.out.println("Consumer consumed: " + data);
        hasData = false;
        notify(); // signal producer to produce again
        return data;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);  // simulate production time
                buffer.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(800); // simulate processing time
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread t1 = new Thread(new Producer(buffer), "Producer-Thread");
        Thread t2 = new Thread(new Consumer(buffer), "Consumer-Thread");

        t1.start();
        t2.start();
    }
}
