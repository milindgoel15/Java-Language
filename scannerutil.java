import java.util.Scanner;

public class scannerutil {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter username: ");
        String name = obj.nextLine();

        System.out.println("Enter uid: ");
        int uid = obj.nextInt();
        obj.close();

        System.out.print("Name: " + name + "\n");
        System.out.print("uid: " + uid);
    }
}
