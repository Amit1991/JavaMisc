package multithreading;

import java.util.stream.IntStream;

public class MyRunnableThread implements Runnable {

    @Override
    public void run() {

        System.out.println("My name is " + Thread.currentThread().getName()
                            + " and I am a runnable thread.");
    }

    public static void main(String[] args) {

        MyRunnableThread runnableThread = new MyRunnableThread();
        runnableThread.run();

        Thread thread = new Thread(runnableThread);
        thread.start();

        IntStream.range(0,5).forEach(a -> new Thread(new MyRunnableThread()).start());
    }
}
