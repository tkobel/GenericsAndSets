package demo;

/**
 *
 * @author Tracy Kobel
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", "Lab", 2, "1234");
        Dog dog2 = new Dog("Fido", "Lab", 2, "1234");
        
        if ( dog1.equals(dog2)) {
            System.out.println("Dogs are equal.");
        } else {
            System.out.println("Dogs NOT equal");
        }
    }
}
