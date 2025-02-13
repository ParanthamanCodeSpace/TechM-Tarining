import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        // Using Hashtable (Can also use HashMap)
        Hashtable<Integer, String> hm = new Hashtable<>();

        // Adding key-value pairs
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        // Printing initial map
        System.out.println("Initial Hashtable: " + hm);

        // Updating value for key 2
        hm.put(2, "For");
        System.out.println("Updated Hashtable: " + hm);

        // Removing key 1
        hm.remove(1);
        System.out.println("Hashtable after removal: " + hm);

        // Traversing the map
        System.out.println("Map Traversal:");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " | Value: " + e.getValue());
        }
    }
}
