package streams;

import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {

        String o1 = (String) Optional.ofNullable(null)
                .orElseGet(() -> "Amit");

        System.out.println(o1);

        /* String o2 = (String) Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException());

        System.out.println(o2); */

        Optional.ofNullable("null")
                .ifPresent(System.out::println);

        Optional.ofNullable("Amit").map(a -> "Hello " + a).ifPresent(System.out::println);
    }
}
