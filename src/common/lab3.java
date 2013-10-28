package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tracy Kobel
 */
public class lab3 {
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
        
        System.out.println("List size = " + list.size());
       
//        Employee secondItem = (Employee)list.get(1);
        Employee secondItem = list.get(1);
        System.out.println("The Second Item in the list");
        System.out.println(secondItem.toString());
        System.out.println();
        
        System.out.println("All items in the list:");
        for(Employee e : list) {
            System.out.println(e.toString());
            System.out.println();
        }
    }    
}
