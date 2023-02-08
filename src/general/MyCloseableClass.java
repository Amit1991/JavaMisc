package general;

import java.io.Closeable;
import java.io.IOException;

public class MyCloseableClass implements Closeable {

    @Override
    public void close() throws IOException {

        System.out.println("Adios Muchaho!");
    }
}
