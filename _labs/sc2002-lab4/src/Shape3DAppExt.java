import java.util.Scanner;

public class Shape3DAppExt {
    public static void main (String[] args) {
        Shape[] shapes;

        int size;
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.print ("How many 3D shapes? ");
        size = scan.nextInt();

        shapes = new Shape[size];

        System.out.println ("Enter the shapes...");
        for (int i = 0; i < size; i++) {
            System.out.println ("Shape for " + i);
            System.out.println ("1. Cylinder");
            System.out.println ("2. Cone");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    shapes[i] = new Cylinder();
                    break;
                case 2:
                    shapes[i] = new Cone();
                    break;
                default:
                    System.out.println ("Invalid choice, try again");
                    i--;
                    continue;
            }
            shapes[i].getDimensions(scan);
        }

        double totalArea = 0;
        for (int i = 0; i < size; i++)
        {
            totalArea += shapes[i].getArea();
        }

        System.out.println ("Total Surface Area: " + totalArea);
    }
}
