import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class program {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}