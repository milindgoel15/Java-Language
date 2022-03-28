// import java.util.ArrayList;
// import java.util.Collection;
import java.util.HashSet;

public class colors {

    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Orange");
        System.out.println("Values in the hashset are: "+colors);
        System.out.println("Number of elements in the hashset are: "+colors.size());
    }
}

// Iterator<String> x = colors.iterator();
//         while (x.hasNext()) {
//             System.out.println(x.next());
//         }