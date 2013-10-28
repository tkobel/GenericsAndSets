package practice;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Tracy Kobel
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<String>();
        
        foodList.add("Pizza");
        foodList.add("Ice cream");
        foodList.add("Watermelon");
        foodList.add("Bacon");
        foodList.add("Biscuits");
        
        printStringArrayList(foodList);
        
        if (foodList.contains("Bacon")) {
            System.out.println("List contains Bacon");
        }
        
        foodList.remove("Bacon");
        
        System.out.println("Bacon removed from list");
        
        printStringArrayList(foodList);
        
        List<String> foodList2 = new ArrayList<String>();
        
        foodList2.add("apples");
        foodList2.add("oranges");
        foodList2.add("Strawberry");
        
        
        
    }
    
    static void printStringArrayList (List al) {
        System.out.println("List contents: ");
        for (Object s : al) {
            System.out.println("Food: " + s);
        }
        System.out.println();
    }
    
}
