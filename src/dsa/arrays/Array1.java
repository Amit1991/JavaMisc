package dsa.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Array1 {

    public static void main(String[] args) {

        /* Initialize Arrays */
        int[] arr1 = {1,2,3,4,5,6};
        /* C style array declaration. Not preferred. */
        int arr2[] = {11,22,33,44,55};
        int[] arr3 = new int[3];
        int arr4[] = new int[4];
        String[] arr5 = new String[2];

        /* Iterate & Print elements */
        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
        Arrays.stream(arr3).forEach(System.out::println);
        Arrays.stream(arr4).forEach(System.out::println);
        Arrays.stream(arr5).forEach(System.out::println);

        /* Sum of elements */
        System.out.println(IntStream.of(arr2).sum());
        System.out.println(Arrays.stream(arr1).sum());

        arr5[0] = "Hello";
        arr5[1] = "Amit";
        Arrays.stream(arr5).forEach(a -> System.out.print(a + " "));
        Arrays.stream(arr5).map(a -> a+" ").forEach(System.out::print);

        /* Max element value */
        System.out.println(IntStream.of(arr2).max());

        /* Max element value, old school */
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < arr2.length; a++)
        {
            if(arr2[a] > max)
            {
                max = arr2[a];
            }
        }
        System.out.println(max);


        /* Elements in reversed order */
        int temp = 0;
        for (int a = 0; a < arr1.length/2; a++)
        {
            temp = arr1[a];
            arr1[a] = arr1[arr1.length-a-1];
            arr1[arr1.length-a-1] = temp;
        }

        Arrays.stream(arr1).forEach(System.out::println);
    }
}
