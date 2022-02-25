import java.util.Scanner;

/**
 * exceptions
 */
public class exceptions {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = obj.nextInt();
        System.out.println("Enter the value of b:");
        int b = obj.nextInt();
        obj.close();
        int c = b/a;
        System.out.println("Value of C: "+ c);

        try {
            c = b/a;
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}