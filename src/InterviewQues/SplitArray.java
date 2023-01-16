package InterviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int splitSize = sc.nextInt();

        if(splitSize < inputStr.length())
        {
            String[] original = inputStr.split("");

            List<Object[]> list = splitArray1(original, splitSize);
            list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

            System.out.println("-------------------------------");

            list = splitArray2(original, splitSize);
            list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

            System.out.println("-------------------------------");

            list = splitArray3(original, splitSize);
            list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
        }

    }

    private static List<Object[]> splitArray3(String[] original, int splitSize) {

        List<Object[]> result = new ArrayList<>();

        int rem = original.length % splitSize;
        int a = 0;
        for(;a < original.length-rem;) {

            result.add(Arrays.copyOfRange(original, a, a + splitSize));
            a += splitSize;
        }

        if(rem > 0)
        {
            result.add(Arrays.copyOfRange(original, a, original.length));
        }

        return result;
    }

    private static List<Object[]> splitArray2(String[] original, int splitSize) {

        List<Object[]> result = new ArrayList<>();

        int rem = original.length % splitSize;
        int a = 0;
        for(;a < original.length-rem;)
        {
            result.add(Arrays.stream(original, a, a+splitSize).toArray());
            a += splitSize;
        }

        if(rem > 0)
        {
            result.add(Arrays.stream(original, a, original.length).toArray());
        }

        return result;
    }

    private static List<Object[]> splitArray1(Object[] original, int splitSize) {

        List<Object[]> result = new ArrayList<>();
        int rem = original.length % splitSize;
        int bucketCount = original.length / splitSize;

        for (int i = 0; i < (rem > 0 ? bucketCount+1 : bucketCount); i++) {

            result.add(Arrays.stream(original).skip(i*splitSize).limit(splitSize).toArray());
        }

        return result;
    }
}
