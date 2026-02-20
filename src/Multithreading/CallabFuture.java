package Multithreading;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) sum += i;
        return sum;
    }
}

public class CallabFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService service =
                Executors.newSingleThreadExecutor();

        Future<Integer> f = service.submit(new MyCallable());
        System.out.println("Sum = " + f.get());

        service.shutdown();
    }
}