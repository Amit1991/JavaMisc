package InterviewQues;

public class NullCall {

    public static void main(String[] args) {
        someMethod(null);

        Integer num1 = 1000, num2 = 1000;
        System.out.println(num1 == num2);//1
        Integer num3 = 20, num4 = 20;
        System.out.println(num3 == num4);//2
        System.out.println(num1 + " -- " + num2);

        System.out.println(Double.MIN_VALUE + " -- " + Double.MAX_VALUE + " --- " +
                Math.min(Double.MIN_VALUE, 0.0d));
    }
    public static void someMethod(Object o) {
        System.out.println("Object method Invoked");
    }
    public static void someMethod(String s) {
        System.out.println("String method Invoked");
    }
}