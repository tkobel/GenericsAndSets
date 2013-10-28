package common;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tracy Kobel
 */
public class lab5 {
    //Next, take the same four Employee objects used above, but this time add them to 
    //a HashMap. What key will you use? How will you retrieve individual items? 
    //What happens when you use a duplicate key? Use put(key, value) to add items; 
    public static void main(String[] args) {
        Employee e1 = new Employee("Brady", "Tom", "111-11-1111");
        Employee e2 = new Employee("Rodgers", "Aaron", "555-55-5555");
        Employee e3 = new Employee("Dalton", "Andy", "111-11-1111");
        Employee e4 = new Employee("Brees", "Drew", "777-77-7777");
        
        Map hashMap = new HashMap();
        hashMap.put("111-11-1111", e1);
        hashMap.put("555-55-5555", e2);
        hashMap.put("111-11-1111", e3);
        hashMap.put("777-77-7777", e4);
        
        Employee retrieve = (Employee)hashMap.get("555-55-5555");
        System.out.println(retrieve);
        
        Employee duplicateKey = (Employee)hashMap.get("111-11-1111");
        System.out.println(duplicateKey);
        System.out.println(hashMap.size());
        
    }
    
    
}
