package Singleton;

/**
 * To overcome the situation with Reflection, Joshua Bloch suggests the use of Enum to implement Singleton design pattern
 * */

public enum EnumSingleton {

    INSTANCE;
    public static void doSomething() {
        // do something
    }
}
