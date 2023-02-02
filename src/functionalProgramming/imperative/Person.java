package imperative;

import streams._Stream;

import java.util.List;
import java.util.Objects;

public class Person implements Comparable {

    public String name;
    public int age;
    public Gender gender;

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
    
    public static List<Person> getSampleList() {

        return List.of(
                new Person("Amit", 31, Gender.Male),
                new Person("Pragya", 31, Gender.Female),
                new Person("Zainab", 32, Gender.Transgender),
                new Person("Puddu", 30, Gender.Female),
                new Person("Aher", 34, Gender.Transgender),
                new Person("Joy", 18, Gender.Fluid),
                new Person("Rahul", 34, Gender.Male),
                new Person("Nitin", 36, Gender.Male),
                new Person("Nitin", 36, Gender.Male),
                new Person("Nitin", 27, Gender.Male),
                new Person("Amit", 29, Gender.Fluid)
        );
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return p.age - this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
