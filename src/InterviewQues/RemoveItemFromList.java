package InterviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveItemFromList {

    public static void main(String[] args) {

        List<String> supplier =  new ArrayList<>();
        supplier.addAll(Arrays.asList("Samsung", "Apple", "Xiomi", "OnePlus", "Motorola",
                "Realme", "Lemon"));

        supplier.removeIf(a -> a.equals("Realme"));

        System.out.println(supplier);

        Iterator<String> itr = supplier.listIterator();
        while (itr.hasNext()) {

            if(itr.next().equals("Motorola")) {

                supplier.remove("Motorola");
            }
        }

        System.out.println(supplier);
    }
}
