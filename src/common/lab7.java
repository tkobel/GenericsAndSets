package common;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tracy Kobel
 */
public class lab7 {
    //Store the same four Employee objects in a TreeSet. Demonstrate that sorting 
    //works AND that duplicates are removed by looping through the set using an 
    //iterator. Use both the natural ordering and an alternative ordering.
    public static void main(String[] args) {
        Employee e1 = new Employee("Brady", "Tom", "111-11-1111");
        Employee e2 = new Employee("Rodgers", "Aaron", "555-55-5555");
        Employee e3 = new Employee("Dalton", "Andy", "111-11-1111");
        Employee e4 = new Employee("Brees", "Drew", "777-77-7777");
        
        Set treeSet = new TreeSet();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        
        for(Object e : treeSet) {
            System.out.println((Employee)e);
        }
    }
    
}
