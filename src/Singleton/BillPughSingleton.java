package Singleton;

/**
 *Prior java 5, java memory model had a lot of issues, these implement singleton class fail in certain scenarios
 * where many threads try to get the instance of the Singleton class simultaneously
 *
 *
 * Create Singleton class with private inner static class that contains the instance of the singleton class
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory
 * */

public class BillPughSingleton {

    private BillPughSingleton() {};

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
