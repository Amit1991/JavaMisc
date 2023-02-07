package dsa.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ArrayToList {

    public static void main(String[] args) {


        /* This List from array produces a collection whose length cannot be changed.
            i.e. No add / remove can be performed. Throws UnsupportedOperationException. */
        Integer[] intArr = {1,2,3,4,5,6,7};

        List<Integer> intList = Arrays.asList(intArr);
        System.out.println(intList);

        int[] intArr2 = {11,22,33,44,55,66,77};
        intList = Arrays.stream(intArr2).boxed().toList();
        System.out.println(intList);

        intList = new ArrayList<>();
        Collections.addAll(intList, intArr);
        System.out.println(intList);

        /*  This will help in creating modifiable List which essentially is an ArrayList. */
        intList = new ArrayList<>(Arrays.asList(intArr));
        intList.add(456);
        System.out.println(intList);

        intList = Arrays.stream(intArr2).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(intList);
    }
}
