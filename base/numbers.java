public class numbers {
    public static void main(String[] args) {
        int large, small;

        int arr[] = { -1, 22, 16, 75, 36, 49 };
        System.out.print("The elements of given array are: ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        large = small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.print("\n\nThe largest number in the given array is: " + large);
        System.out.print("\nThe smallest number in the given array is: " + small);
    }
}
