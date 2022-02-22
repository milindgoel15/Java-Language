/**
 * string
 */
public class string {

    public static void main(String[] args) {
        String str = "Milind";
        String str2 = new String("Goel");

        System.out.println(str + " " + str2);

        StringBuffer str3 = new StringBuffer("Hello everyone");
        System.out.println(str3.append("."));
        // maintains sync and threads independently

        // same as string buffer but
        // sync is not maintained and threads can interrupt existing thread
        // StringBuilder str4 = new StringBuilder("Hello Everyone");
        // System.out.println(str4.append("."));

        System.out.println(str3.hashCode());
        System.out.println(str3.replace(0, 5, "Hi"));
        System.out.println(str3.isEmpty()); // returns boolean
        System.out.println(str3.capacity()); // returns 30 if the no of characters in string is less than or equal to 30. returns the actual no of charaters if charaters are beyond 30


    }
}