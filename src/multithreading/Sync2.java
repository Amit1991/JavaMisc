package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sync2 {

    public synchronized void m1(String objName)
    {
        try
        {
             System.out.println(objName);
             Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Sync2 s = new Sync2();
        Sync2 s1 = new Sync2();
        //s.m1("s");
        //s1.m1("s1");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                s.m1("s - 1");
                s.m1("s - 2");
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                s1.m1("s1");
            }
        };

        List<Runnable> runners = new ArrayList<>();
        runners.add(runnable);
        runners.add(runnable1);

        runners.parallelStream().forEach(r -> r.run());
    }
}
