package Prototype;

import java.util.ArrayList;
import java.util.List;

/***
 * Prototype design pattern is used when the object creation required a lot of time and resources
 * and you have a similar object
 *
 *
 * Example: we have a object that loads data from database
 * We need to modify data multiple times
 * That isn't a good idea to create object using new keyword and load all data again from database
 *
 */

public class Employees implements Cloneable {

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        // read all employees from database and put into the list
        empList.add("trinhlk2");
        empList.add("yippie");
        empList.add("truonglk9");
        empList.add("Abba");
    }

    public List<String> getEmpList() {
        return empList;
    }

    // Clone method is overridden to provide a deep copy of the employees list
    @Override
    public Employees clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}
