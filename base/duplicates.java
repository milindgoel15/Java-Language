/**
 * duplicates
 */
public class duplicates {

    public static void main(String args[]) {
        int arr[] = { 4, 6, 1, 9, 5, 4, 6 };
        System.out.print("The elements of given array are: ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nFollowing are the duplicates in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}