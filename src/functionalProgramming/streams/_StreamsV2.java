package streams;

import imperative.Gender;
import imperative.Person;

import java.util.Comparator;

public class _StreamsV2 {

    public static void main(String[] args) {

        Person.getSampleList().stream()
                .filter(a -> a.gender.equals(Gender.Female))
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .map(a -> a.gender)
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .flatMap
                        (a -> a.name.lines()
                                .map(x -> x + " is " + a.gender + " and " + a.age + " years old."))
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .flatMap(a -> a.name.lines()
                                .filter(b -> b.startsWith("P"))
                                .map(x -> x+" Tiwary"))
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.age - o2.age;
                    }
                })
                .map(a -> a.name + " : " + a.age)
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .sorted()
                .map(a -> a.name + " : " + a.age)
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream().parallel()
                .map(a -> a.name + " : " + a.hashCode())
                .forEach(System.out::println);

        System.out.println("---------------------");

        Person.getSampleList().stream()
                .distinct()
                .forEach(System.out::println);
    }
}
