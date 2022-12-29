package java14;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Records {

    /* Introduced in Java14 */
    /* Records are immutable data classes that requires only name and type of fields */
    /* All record declarations compile into class which inherits java.lang.Record */
    /* All fields of record compile into final members which make them un-inheritable and immutable */
    public record Person(String name, String email, LocalDate dob, RecordSupport.Address address) {

        /* Records can have static fields and methods */
        public static RecordSupport.Address defaultAddress = new RecordSupport.Address(
                "India",
                "UP",
                "Lucknow"
        );

        /* Records can have instance methods also */
        public int getAge() {

            return Period.between(this.dob(), LocalDate.now()).getYears();
        }

        /* default hashCode() and equals() is provided but can be overriden */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return name.equals(person.name) && email.equals(person.email) && dob.equals(person.dob);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, dob, address);
        }

        /* toString() is also provided by default */
    };

    public static void main(String[] args) {

        Person p = new Person("Amit", "amit@kumar.com",
                LocalDate.of(1991, 4, 30),
                new RecordSupport.Address("India", "UP", "Gorakhpur"));

        Person p1 = new Person("Amit", "amit@kumar.com",
                LocalDate.of(1991, 4, 30),
                new RecordSupport.Address("India", "UP", "Gorakhpur"));

        Person p3 = new Person("Pragya", "11medicopragya@gmail.com",
                LocalDate.of(1991, 10, 06), Person.defaultAddress);

        Person p4 = new Person("Amit", "amit@kumar.com",
                LocalDate.of(1991, 4, 30), Person.defaultAddress);

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p.hashCode());
        System.out.println(p.equals(p1));
        System.out.println(p.address());
        System.out.println(p.getAge());
        System.out.println(p3);
        System.out.println(p.equals(p4));
    }
}