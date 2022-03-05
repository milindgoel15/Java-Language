import java.util.Scanner;

/**
 * exceptions
 */
public class exceptions {

    public static void main(String[] args) {
        // int a = 0;
        // int b = 5;
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = obj.nextInt();
            System.out.println("Enter the value of b:");
            int b = obj.nextInt();
            obj.close();
            int c = b/a;
            System.out.println("Value of C: "+ c);
            c = b/a;
        } 
        catch (Exception e) {
            // e.printStackTrace();
            System.out.print(e);
        } 
        finally {
            System.out.print("\nBye");
        }
    }
}