package functionalProgramming.functionalInterface;

public class TestFuncInterface {

    static IFunctional1 iFunc = (a, b) -> b.startsWith("a");
    public static void main(String[] args) {

        System.out.println(iFunc.func1(1, "amit"));
    }
}
