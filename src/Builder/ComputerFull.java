package Builder;

/**
 * When we have a lot of attributes(required and optional) need pass from client
 * If we provide a constructor for required attributes and setters for other optional attributes => inconsistent
 *
 *
 * Builder pattern solves the issue by providing a way to build the object step-by-step and provide a method return final object
 * */


/**
 * Create a static nested class(Builder class) and copy all arguments from outer class to this.
 * Builder class have public constructor with all required attributes
 * Builder class have method set optional attributes and return the same Builder object
 * provide a build() method in the builder class
 * */
public class ComputerFull {

    // required parameters
    private String HDD;
    private String RAM;

    // optinal parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "ComputerFull{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    private ComputerFull(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Builder class
    public static class ComputerBuilder {

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerFull build() {
            return new ComputerFull(this);
        }


    }
}
