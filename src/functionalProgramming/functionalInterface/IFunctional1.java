package functionalInterface;

@FunctionalInterface
public interface IFunctional1 {

    public boolean func1(int param1, String param2);

    public static String func2(int a, double b){

        return "Nothing!";
    };

    public static String func3(int a, double b){

        return "Something!";
    };

    public default double func4(boolean bool) {

        return Math.random();
    };

    public default double func5(boolean bool) {

        return Math.random();
    }
}
