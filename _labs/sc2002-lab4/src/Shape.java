import java.util.Scanner;

public class Shape {
    public boolean getDimensions(Scanner sc) {
        return false;
    }

    public double getArea() {
        return -1;
    }
    public double getVolume() {
        return -1;
    }
}

class Square extends Shape {
    double length;

    public boolean getDimensions(Scanner sc) {
        System.out.print ("\nEnter length: ");
        this.length = sc.nextDouble();
        System.out.println();
        return true;
    }

    public double getArea() {
        return (length * length);
    }

    public double getVolume() {
//        not implemented
        return -1;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter length: ");
        this.length = sc.nextDouble();
        System.out.print ("Enter breadth: ");
        this.breadth = sc.nextDouble();
        System.out.println();
        return true;
    }

    public double getArea() {
        return (length * breadth);
    }

    public double getVolume() {
//        not implemented
        return -1;
    }
}

class Circle extends Shape {
    double radius;

    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter radius: ");
        this.radius = sc.nextDouble();
        System.out.println();
        return true;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getVolume() {
//        not implemented
        return -1;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter height: ");
        this.height = sc.nextDouble();
        System.out.print ("Enter base: ");
        this.base = sc.nextDouble();
        System.out.println();
        return true;
    }

    public double getArea() {
        return (0.5 * base * height);
    }

    public double getVolume() {
//        not implemented
        return -1;
    }
}

class Cuboid extends Rectangle {
    double height;
    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter height: ");
        this.height = sc.nextDouble();
        super.getDimensions(sc);
        return true;
    }

    public double getArea() {
        return (2 * length * breadth) + (2 * length * height) + (2 * height * breadth);
    }
}

class SqPyramid extends Triangle {
    public double getArea() {
        return ((super.getArea() * 4) + base * base);
    }
}

class Sphere extends Circle {
    public double getArea() {
        return super.getArea() * 4;
    }
}

class Cone extends Circle {
    double height;
    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter height: ");
        this.height = sc.nextDouble();
        super.getDimensions(sc);
        return true;
    }
    public double getArea() {
        // Calculate slant height using Pythagorean theorem
        double slantHeight;
        slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralArea = Math.PI * radius * slantHeight;
        return (baseArea + lateralArea);
    }
}

class Cylinder extends Circle {
    double height;
    public boolean getDimensions(Scanner sc) {
        System.out.print ("Enter height: ");
        this.height = sc.nextDouble();
        super.getDimensions(sc);
        return true;
    }
    public double getArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralArea = 2 * Math.PI * radius * height;
        return (2 * baseArea + lateralArea);
    }
}
