package multithreading;

import java.util.stream.IntStream;

public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " with Id " +
                    Thread.currentThread().getId() + " -- is running.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.run();

        IntStream.range(0,5).forEach(a -> new MyThread().start());
    }
}
