interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }
    public double calculateArea() { return Math.PI * radius * radius; }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double l, double b) { length = l; breadth = b; }
    public double calculateArea() { return length * breadth; }
}

class Square implements Shape {
    double side;
    Square(double s) { side = s; }
    public double calculateArea() { return side * side; }
}

class Q27_Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(4);

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + r.calculateArea());
        System.out.println("Square Area = " + s.calculateArea());
    }
}