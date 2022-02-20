public class maxnumbers {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 9, 1, 15, 6 };
        int first = 0;
        int second = 0;

        System.out.print("The given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (first < current) {
                second = first;
                first = current;
            } else if (second < current) {
                second = current;
            }
        }

        System.out.println("\n\nThe top 2 elements in the given array are " + first + " and " + second);
    }
}
