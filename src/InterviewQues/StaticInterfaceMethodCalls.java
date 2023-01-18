package InterviewQues;

import java.util.Scanner;

interface Interface3 {

    static void sayMyName(String name) {

        System.out.println("Hello " + name + ", Interface3 welcomes you!");
    }
}

interface Interface4 {

    static void sayMyName(String name) {

        System.out.println("Hello " + name + ", Interface4 welcomes you!");
    }
}
public class StaticInterfaceMethodCalls implements Interface3, Interface4 {

    public static void sayMyName(String name) {

        Interface3.sayMyName(name);
        Interface4.sayMyName(name);
        System.out.println("Hello " + name + ", StaticInterfaceMethodCalls welcomes you!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayMyName(name);
    }
}
