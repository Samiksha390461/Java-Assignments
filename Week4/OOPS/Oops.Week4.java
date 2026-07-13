package WEEK_4.OOPS;

interface Test {
    int square(int x);
}
class Arithmetic implements Test {
    public int square(int x) {
        return x * x;
    }
}
class Outer {
    void display() {
        System.out.println("Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Inner class");
        }
    }
}
class Point {
    private int x, y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}
class Box {
    double len, br;

    public Box(double length, double breadth) {
        this.len = length;
        this.br = breadth;
    }

    public double area() {
        return len * br;
    }
}

class Box3D extends Box {
    double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return len* br* height;
    }
}

public class OOPSWeekAssignment {
    public static void main(String[] args) {

        // Question 1------------------>
        System.out.println("Q1: Interface");
        Arithmetic a = new Arithmetic();
        System.out.println("Square of 5 = " + a.square(5));

        // Question 2------------------------>
        System.out.println("\nQ2: Inner Class");
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Question 3---------------->
        System.out.println("\nQ3: Point Class");
        Point p1 = new Point();
        p1.display();
        Point p2 = new Point(10, 20);
        p2.display();
        p2.setX(30);
        p2.setY(40);
        p2.display();
        p2.setXY(50, 60);
        p2.display();

        // Question 4---------------------->
        System.out.println("\nQ4: Box and Box3D");
        Box box = new Box(10, 5);
        System.out.println("Area of Box = " + box.area());
        Box3D box3d = new Box3D(10, 5, 4);
        System.out.println("Area of Box3D = " + box3d.area());
        System.out.println("Volume of Box3D = " + box3d.volume());
    }
}
