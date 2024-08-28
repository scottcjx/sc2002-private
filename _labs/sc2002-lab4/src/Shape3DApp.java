import java.util.Scanner;

public class Shape3DApp {
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
            System.out.println ("1. Cuboid");
            System.out.println ("2. Sphere");
            System.out.println ("3. Pyramid (Square-based)");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    shapes[i] = new Cuboid();
                    break;
                case 2:
                    shapes[i] = new Sphere();
                    break;
                case 3:
                    shapes[i] = new SqPyramid();
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
