import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        
        color.put(1, "Red");
        color.put(2, "Green");
        color.put(3, "Blue");
        color.put(4, "Yellow");
        color.put(5, "Black");
        
        System.out.println("The set is: " + color.entrySet());
        System.out.println("\nDoes the orange color exists in the color map?\n" + color.containsValue("Orange"));
    }
}


// color2.put(6, "Orange");
// color2.putAll(color);
// System.out.println("The new set is: " + color2.entrySet());
// HashMap<Integer, String> color2 = new HashMap<Integer, String>();
// System.out.println("The size of the map is: " + color.size());