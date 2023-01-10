package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Sync {

    public int counter = 0;

    public void inc() {

        synchronized (Sync.class) {
            System.out.println(counter++);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Sync sync = new Sync();
        ExecutorService es = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).forEach(count -> es.submit(sync::inc));
        es.wait(1000);
    }
}
