import java.util.Scanner;

public class Shape2DApp {
    public static void main (String[] args) {
        Shape[] shapes;

        int size;
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.print ("How many shapes? ");
        size = scan.nextInt();

        shapes = new Shape[size];

        System.out.println ("Enter the shapes...");
        for (int i = 0; i < size; i++) {
            System.out.println ("Shape for " + i);
            System.out.println ("1. Square");
            System.out.println ("2. Rectangle");
            System.out.println ("3. Circle");
            System.out.println ("4. Triangle");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    shapes[i] = new Square();
                    break;
                case 2:
                    shapes[i] = new Rectangle();
                    break;
                case 3:
                    shapes[i] = new Circle();
                    break;
                case 4:
                    shapes[i] = new Triangle();
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

        System.out.println ("Total Area: " + totalArea);
    }
}
