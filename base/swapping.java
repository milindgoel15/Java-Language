public class swapping {
    public static void main(String args[]) {
        // int x,y,z;   Using third variable
        int x,y;
        
        x = 10;
        y = 20;

        System.out.println("Before swapping: " + x + " " + y);
        
        // z = x;   Using third variable
        // x = y;   Using third variable
        // y = z;   Using third variable
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.print("After swapping: " + x + " " + y);
    }
}
