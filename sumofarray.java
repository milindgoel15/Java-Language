public class sumofarray {
    public static void main(String args[]) {
        int a[] = {1,3,5,7,9};
        int b[] = {11,13,15,17,19};
        int sum[] = new int[5];

        System.out.print("Elements of array a are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nElements of array b are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.print("\n\nThe sum of arrays is: ");
        for (int i = 0; i < sum.length; i++) {
            sum[i] = a[i] + b[i];
        }

        for (int j = 0; j < sum.length; j++) {
            System.out.print(sum[j] + " ");
        }
    }
}
