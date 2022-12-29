package designPatterns.singleton;

public class SingletonTests {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s + " ---- " + s1 + " ---- " + s.equals(s1));


        BillPughSingleton bps = BillPughSingleton.getInstance();
        BillPughSingleton bps1 = BillPughSingleton.getInstance();
        BillPughSingleton bps2 = BillPughSingleton.getInstanceNew();

        System.out.println(bps + " ---- " + bps1 + " ---- " + bps2 + " ---- " + bps.equals(bps1));
    }
}
