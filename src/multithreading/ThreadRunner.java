package multithreading;

import java.util.stream.IntStream;

public class ThreadRunner {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.run();

        for (int i = 0; i < 20; i++) {

            MyThread newThread = new MyThread();
            newThread.start();
        }
    }
}
