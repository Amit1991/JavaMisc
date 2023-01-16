package InterviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {

    public static void main(String[] args) throws Exception {
        Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
        Object[] array1 = { "A", 2, new Object[] { 3, "C", new Object[] { 5 }, 6, "D"}, 8, "E", 10 };

        System.out.println(Arrays.toString(flatten1(array)));
        System.out.println(Arrays.toString(flatten1(array1)));
        System.out.println(Arrays.toString(flatten2(array1)));
    }

    private static Object[] flatten2(Object[] array) {

        List<Object> result = new ArrayList<>();

        for (Object a: array) {

            if(a instanceof Object[])
            {
                result.addAll(Arrays.asList(flatten2((Object[]) a)));
            }
            else {

                result.add(a);
            }
        }

        return result.toArray();
    }

    private static Object[] flatten1(Object[] array) {

        return Arrays.stream(array)
                .flatMap(a -> a instanceof Object[] ? Arrays.stream(flatten1((Object[]) a)) : Stream.of(a))
                .toArray();
    }
}
