package streams;

import dsa.ArrayLists.ArrayList1;

import java.util.Arrays;
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

        /* reduce() examples */
        OptionalInt sum = IntStream.range(1,10).reduce(Integer::sum);
        //OptionalInt sum = IntStream.range(1,10).reduce((a, b) -> a+b);
        System.out.println(sum.isPresent() ? sum.getAsInt() : 0);

        OptionalInt product = IntStream.range(1,10).reduce((a, b) -> a*b);
        System.out.println(product.isPresent() ? product.getAsInt() : 0);

        Optional<Integer> max = Arrays.stream(ArrayList1.data).reduce(Integer::max);
        //Optional<Integer> max = Arrays.asList(ArrayList1.data).stream().reduce((a, b) -> a > b ? a : b);
        System.out.println(max.orElse(0));

        Optional<Integer> min = Arrays.stream(ArrayList1.data).reduce(Integer::min);
        //Optional<Integer> min = Arrays.asList(ArrayList1.data).stream().reduce((a, b) -> a < b ? a : b);
        System.out.println(min.orElse(0));
    }
}
