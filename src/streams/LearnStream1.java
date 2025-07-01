package streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LearnStream1 {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1,2,3,4,5,6);
        intStream.asDoubleStream().forEach(System.out::println);
        System.out.println("-----------------------------------");
        /*
            The Following line of code will give exception as the stream once opened and worked upon
            cannot be processed again. Every stream is a use-once thing.
        */
        //intStream.asLongStream().forEach(System.out::println);

        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.range(1,10).asDoubleStream().forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.range(1,10).asLongStream().forEach(System.out::println);
        System.out.println("-----------------------------------");
        OptionalInt sum = IntStream.range(1,10).reduce((a, b) -> a+b);
        System.out.println(sum.getAsInt());
    }
}
