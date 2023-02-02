package streams;

import imperative.Gender;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

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

        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .map(name -> name.length())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final int age;
        private final Gender gender;

        public Person(String name, int age, Gender gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}
