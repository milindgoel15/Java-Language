/**
 * collections
 * it is used in place of arrays 
 * if the no of array items is unknown
 * 
 * ArrayList-10
 * Vector-10
 * HashSet-16
 * HashMap-16
 * HashTable-11
 * HashSet-16
 * 
 */
import java.util.*;

public class collections {

    public static void main(String[] args) {
        // arraylist
        Collection values = new ArrayList();
        values.add(1);
        values.add("Milind");
        Collection<Integer> value = new ArrayList<>();
        value.add(5);
        System.out.println(values);

        // linked list
        Collection linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add("Milind");
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        // hashlist
        HashSet<Integer> hashList = new HashSet<>();
        hashList.add(1);
        hashList.add(3);
        hashList.add(34);
        hashList.add(2);
        hashList.add(4);
        System.out.println(hashList);

    }
}