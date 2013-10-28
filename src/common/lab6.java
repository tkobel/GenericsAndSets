package common;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Tracy Kobel
 */
public class lab6 {
    //Store the same four Employee objects in a TreeMap. Demonstrate that sorting 
    //works. First, make sure you override compareTo() from the Comparable interface. 
    //Now try using a Comparator from the GenericsAndMaps project (remember 
    //you’ll need a utility class).
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Brady", "Tom", "111-11-1111");
        Employee e2 = new Employee("Rodgers", "Aaron", "555-55-5555");
        Employee e3 = new Employee("Dalton", "Andy", "111-11-1111");
        Employee e4 = new Employee("Brees", "Drew", "777-77-7777");
        
        Map treeMap = new TreeMap();
        treeMap.put("111-11-1111", e1);
        treeMap.put("555-55-5555", e2);
        treeMap.put("111-11-1111", e3);
        treeMap.put("777-77-7777", e4);
    }
}
