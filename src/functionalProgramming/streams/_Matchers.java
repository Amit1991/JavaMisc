package streams;

import imperative.Gender;
import imperative.Person;

import java.util.List;

public class _Matchers {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Amit", 31, Gender.Male),
                new Person("Pragya", 31, Gender.Female),
                new Person("Zainab", 32, Gender.Transgender),
                new Person("Puddu", 30, Gender.Female),
                new Person("Aher", 34, Gender.Transgender),
                new Person("Joy", 18, Gender.Fluid),
                new Person("Rahul", 34, Gender.Male),
                new Person("Nitin", 36, Gender.Male)
        );

        System.out.println(people.stream().allMatch(a -> a.gender.equals(Gender.Transgender)));
        System.out.println(people.stream().anyMatch(a -> a.gender.equals(Gender.Transgender)));
        System.out.println(people.stream().noneMatch(a -> a.gender.equals(Gender.Unspecified)));
        people.stream().filter(a -> a.gender.equals(Gender.Fluid)).forEach(System.out::println);
        people.stream()
                .filter(a -> a.gender.equals(Gender.Unspecified))
                .findAny()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No such person exists"));
    }
}
