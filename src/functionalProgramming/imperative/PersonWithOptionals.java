package imperative;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class PersonWithOptionals implements Comparable {

    public String name;
    public LocalDate dob;
    public Long aadharNumber;
    public Gender gender;

    public Optional<String> getName() {
        return Optional.of(name);
    }

    public Optional<LocalDate> getDob() {
        return Optional.ofNullable(dob);
    }

    public Optional<Long> getAadharNumber() {
        return Optional.ofNullable(aadharNumber);
    }

    public Optional<Gender> getGender() {
        return Optional.of(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonWithOptionals{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", aadharNumber=" + aadharNumber +
                ", gender=" + gender +
                '}';
    }

    public PersonWithOptionals(String name, LocalDate dob, Long aadharNumber, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.aadharNumber = aadharNumber;
        this.gender = gender;
    }

    public PersonWithOptionals() {

    }

    public static List<PersonWithOptionals> getSampleList() {

        return List.of(
            new PersonWithOptionals("Amit", null, null, Gender.Male),
            new PersonWithOptionals("Pragya", LocalDate.of(1990, 10, 6), null, Gender.Female),
            new PersonWithOptionals("Zainab", null, 531999135273l, Gender.Transgender)
        );
    }

    public static void main(String[] args) {

        getSampleList().stream()
                .forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream()
                .filter(a -> a.getDob().isPresent())
                .forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream().map(a -> a.getDob().orElseGet(() -> LocalDate.now()))
                .forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream().map(a -> a.getDob().orElseGet(() -> LocalDate.now()))
                .forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream().sorted().forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream()
                .peek(a -> {
                    if(!a.getDob().isPresent()) {
                        a.setDob(LocalDate.now());
                    }
                })
                .peek(a -> {
                    if(!a.getAadharNumber().isPresent()) {
                        a.setAadharNumber(999999999999l);
                    }
                })
                .forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream().skip(1).forEach(System.out::println);

        System.out.println("---------------------");

        getSampleList().stream().limit(2).forEach(System.out::println);
    }

    @Override
    public int compareTo(Object o) {
        PersonWithOptionals pwo = (PersonWithOptionals) o;

        return this.getDob().orElse(LocalDate.now()).isAfter(pwo.getDob().orElse(LocalDate.now())) ? 1 : -1;
    }
}
