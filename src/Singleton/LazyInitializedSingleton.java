package Singleton;

/**
 * The implementation works fine in case of the single-threaded environment
 * In multi-thread environment, multiple threads are inside the if-condition(creates many instances)
 * */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {};

    // Lazily initializing instance
    public static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
