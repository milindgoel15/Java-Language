/**
 * collections
 * it is used in place of arrays 
 * if the no of array items is unknown
 */
import java.util.*;

public class collections {

    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(1);
        values.add("Milind");
        Collection<Integer> value = new ArrayList<>();
        value.add(5);
        System.out.println(values);
    }
}