package Singleton;

import java.io.*;

/**
 * After testing we notice that it destroys the singleton pattern(2 hashCode different)
 *
 *
 * To overcome this scenario we need to implement the readResolve() method
 * */

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        output.writeObject(instanceOne);
        output.close();

        // deserialize from file to object
        ObjectInput input = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) input.readObject();
        input.close();

        System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());
    }
}
