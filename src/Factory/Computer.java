package Factory;

/**
 * The factory design pattern is used when we have a superclass with multiple sub-classes
 * based on input, we need to return one of the sub-class
 *
 * Super class can be interface, abstract class or normal class
 * */

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + ", HDD = " + this.getHDD() + ", CPU = " + this.getCPU();
    }
}
