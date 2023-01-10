package designPatterns.singleton;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }
}
