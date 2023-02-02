package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    static int a = 5;
    public static void main(String[] args) {

        System.out.println(increment(a));
        System.out.println(inc.apply(a));
        System.out.println(tenTimes.apply(a));
        System.out.println(tenTimes.apply(inc.apply(a)));

        Function f = inc.andThen(tenTimes);
        System.out.println(f.apply(a));
        System.out.println(biFunc.apply(a,a));
        System.out.println(sum.apply(a, a+1));
    }

    static Function<Integer, Integer> tenTimes = a -> a*10;

    static Function<Integer, Integer> inc = num -> num + 1;
    static int increment(int a) {

        return a+1;
    }

    static BiFunction<Integer, Integer, Integer> biFunc = (x, y) -> (x + 1) * y;

    static BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
}
