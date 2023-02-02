package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer c = new Customer("Amit", "8655090667");
        greetCustomer(c);
        greet.accept(c);
        greeter.accept(c, new Customer("Chanda", "9988665544"));
    }

    static BiConsumer<Customer, Customer> greeter = (a, b) -> System.out.println(a.name + " -- " + b.name);
    static Consumer<Customer> greet = c -> System.out.println(c);
    static void greetCustomer(Customer c) {
        System.out.println(c.name + " -- " + c.phone);
    }

    static class Customer {
        private String name;
        private String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Customer {" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
