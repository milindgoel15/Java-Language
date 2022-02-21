/**
 * area
 */
import java.util.Scanner;

public class area {

    void areaOfRetangle() {
        int length = 0; 
        int breadth = 0;
        double areaOfRetangle;

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        length = obj.nextInt();
        
        System.out.print("Enter the value of B: ");
        breadth = obj.nextInt();

        areaOfRetangle = length * breadth;
        System.out.println("Area of rectangle is: "+areaOfRetangle);
    }
    void areaOfSquare() {
        int a = 0;
        double areaOfSquare;
        Scanner obj = new Scanner(System.in);

        System.out.print("\n\nEnter the value of a: ");
        a = obj.nextInt();
        areaOfSquare = a * a;
        System.out.println("Area of square is: "+areaOfSquare);
    }
    void areaOfCircle() {
        int radius = 0; 
        double pi = 3.14;
        double areaOfCircle;

        Scanner obj = new Scanner(System.in);

        System.out.print("\n\nEnter the value of radius: ");
        radius = obj.nextInt();
        areaOfCircle = pi * radius * radius;
        System.out.println("Area of circle is: "+areaOfCircle);
    }

    public static void main(String[] args) {
        area a =  new area();
        a.areaOfRetangle();
        a.areaOfSquare();
        a.areaOfCircle();
    }
}