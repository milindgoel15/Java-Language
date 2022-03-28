public class twodarray {
    public static void main(String args[]) {
        int a[][] = {{1,2,3}, {4,5,6}};
        int b[][] = {{4,5,6}, {7,8,9}};
        int sum[][] = new int[3][3];
        
        System.out.print("Elements of matrix a are: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Elements of matrix b are: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\nThe sum of matrix is: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
