package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Tracy Kobel
 */
public class lab4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee("Brady", "Tom", "111-11-1111");
        Employee e2 = new Employee("Rodgers", "Aaron", "555-55-5555");
        Employee e3 = new Employee("Dalton", "Andy", "1111-11-1111");
        Employee e4 = new Employee("Brees", "Drew", "777-77-7777");
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);
        
        Set<Employee> set = new HashSet<Employee>(list);
        List<Employee> newList = new ArrayList<Employee>(set);
        
        System.out.println("Original list size: " + list.size());
        System.out.println("New list size: " + newList.size());
    }
}
