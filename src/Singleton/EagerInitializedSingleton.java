package Singleton;

/**
 * The instance is created at the time of class loading
 * Client application might not be using it
 * Doesn't provide any options for exception handling
 *
 * If singleton class is not using a lot of resources, this is the approach to use.
 * But if singleton class using a lot of resources, we should avoid the instantiation unless the client call the
 * method getInstance
 *
 * */
public class EagerInitializedSingleton {

    // Eagerly initializing instance when loading class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {};

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
