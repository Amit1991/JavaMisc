package InterviewQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);

        IntStream.range(1, num).forEach(a -> {

            fib.add(fib.get(a) + fib.get(a-1));
        });

        System.out.println(fib);
    }
}
