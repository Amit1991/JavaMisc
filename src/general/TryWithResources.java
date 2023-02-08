package general;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.stream.Collectors;

public class TryWithResources {

    public static void main(String[] args) {

        String text = "";
        try {

            text = Files.lines(Path.of("D:\\intellij-ws\\JavaMisc\\nothing.txt"))
                    .collect(Collectors.joining("\n")) + "\n";

        }
        catch (Exception e) {

            e.printStackTrace();
        }

        try(FileOutputStream foo = new FileOutputStream("nothing.txt")) {

            text += "This line of text is added using Try-With-Resources. " + new Random().nextFloat();
            byte arr[] = text.getBytes();

            foo.write(arr);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try(MyCloseableClass myCloseableClass = new MyCloseableClass())
        {
            int[] arr = {};
            System.out.println(arr[0]);
            System.out.println("Ciao.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
