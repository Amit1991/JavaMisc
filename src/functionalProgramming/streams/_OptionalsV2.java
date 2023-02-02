package streams;

import java.util.Optional;

public class _OptionalsV2 {

    public static void main(String[] args) {

        Optional<Object> o = Optional.empty();
        System.out.println(o.orElseGet(() -> "Amit"));
        o.ifPresentOrElse(System.out::println, () -> System.out.println("No value present"));
    }
}
