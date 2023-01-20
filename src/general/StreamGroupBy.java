package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupBy {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Adam", "Joe", "Bill", "Jack", "Joe", "Ian"));
        Map<String, Long> res = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> res2 = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(res);
        System.out.println(res2);
    }
}
