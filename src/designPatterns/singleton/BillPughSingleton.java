package designPatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class BillPughSingletonProvider {
        private static final BillPughSingleton bps = new BillPughSingleton();
        private static final BillPughSingleton getBps() {

            System.out.println("In static inner class's static method...");
            System.out.println(bps == null);
            return bps;
        }
    }

    public static BillPughSingleton getInstance() {

        return BillPughSingletonProvider.bps;
    }

    public static BillPughSingleton getInstanceNew() {

        return BillPughSingletonProvider.getBps();
    }
}
