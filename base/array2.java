/**
 * array2
 */
public class array2 {

    public static void main(String args[]) {
        int a[]= {1,3,5,7,9};
        int sum = 0;
        float avg = 0;
        System.out.println("Elements of array: ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum = a[i] + sum;
        }

        avg = sum / a.length;
        System.out.println("Sum of elements of an array is: " + avg);
    }
}