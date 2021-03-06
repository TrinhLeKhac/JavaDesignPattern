package Singleton;

import java.lang.reflect.Constructor;

/**
 * Reflection can be used to destroy all the above singleton implementation approaches.
 * */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor: constructors) {
                // Below code will destroy the singleton class
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        assert instanceTwo != null;
        System.out.println(instanceTwo.hashCode());
    }
}
