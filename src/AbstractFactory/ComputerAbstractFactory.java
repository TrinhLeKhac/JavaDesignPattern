package AbstractFactory;

import Factory.Computer;

/**
 * In factory design pattern, we have a single factory class,
 * This factory have method return different subclasses instances base on input
 * and using if-else to achieve this.
 *
 *
 * In abstract factory pattern, get rid of if-else and we have factory class for each sub-class.
 * We have abstract factory class will return the sub-class based on input factory class
 * */

// abstract factory class
public interface ComputerAbstractFactory {
    public Computer createComputer();
}
