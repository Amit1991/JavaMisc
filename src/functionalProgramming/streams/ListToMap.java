package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public record Person(String name, int age){};
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30));
        Map<String, Person> peopleMap = people.stream()
                .collect(Collectors.toMap(Person::name, Function.identity()));

        System.out.println(peopleMap);
    }
}
