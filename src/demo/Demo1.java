package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Tracy Kobel
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<String> grocerySet = new HashSet<String>();
        grocerySet.add("Beer");
        grocerySet.add("Chips");
        grocerySet.add("Salsa");
        grocerySet.add("Beer");
        grocerySet.add("Chips");
        
        int size = grocerySet.size();
        System.out.println("Set size: " + size);
        
        for(String s : grocerySet) {
            System.out.println("Item: " + s);   
        }
        
        
        
        
        
        
        
        
        
        
//        List<String> grocerySet = new ArrayList<String>();
//        grocerySet.add("Beer");
//        grocerySet.add("Chips");
//        grocerySet.add("Salsa");
//        grocerySet.add("Beer");
//        grocerySet.add("Chips");
//        
//        int size = grocerySet.size();
//        System.out.println("List size: " + size);
//        
//        for(String s : grocerySet) {
//            System.out.println("Item: " + s);   
//        }
    }
}
