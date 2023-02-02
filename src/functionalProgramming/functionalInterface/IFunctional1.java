package functionalProgramming.functionalInterface;

@FunctionalInterface
public interface IFunctional1 {

    boolean func1(int param1, String param2);

    static String func2(int a, double b){

        return "Nothing!";
    };

    static String func3(int a, double b){

        return "Something!";
    };

    default double func4(boolean bool) {

        return Math.random();
    };

    default double func5(boolean bool) {

        return Math.random();
    }
}
