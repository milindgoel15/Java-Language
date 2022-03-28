/**
 * array
 */
public class array {

    public static void main(String args[]) {
        int a[] = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("\n");
        }
    }
}