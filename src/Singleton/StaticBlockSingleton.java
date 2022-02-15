package Singleton;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    StaticBlockSingleton() {};

    // static block initialization for exception handling + eagerly initializing instance when loading class
    static {
        try{
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
