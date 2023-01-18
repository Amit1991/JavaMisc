package InterviewQues;

import java.util.Scanner;

interface Interface1 {

    default void sayMyName(String name) {

        System.out.println("Hello " + name + ", Interface1 welcomes you!");
    }
}

interface Interface2 {

    default void sayMyName(String name) {

        System.out.println("Hello " + name + ", Interface2 welcomes you!");
    }
}

public class DefaultMethodCalls implements Interface1, Interface2 {

    public void sayMyName(String name) {

        Interface1.super.sayMyName(name);
        Interface2.super.sayMyName(name);
        System.out.println("Hello " + name + ", DefaultMethodCalls welcomes you!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DefaultMethodCalls dmc = new DefaultMethodCalls();
        dmc.sayMyName(scanner.nextLine());
    }
}
