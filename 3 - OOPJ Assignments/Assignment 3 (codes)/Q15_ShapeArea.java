class Q15_ShapeArea {
    double calculateArea(int side) {
        return side * side;
    }

    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Q15_ShapeArea s = new Q15_ShapeArea();
        System.out.println("Square Area = " + s.calculateArea(5));
        System.out.println("Rectangle Area = " + s.calculateArea(4, 6));
        System.out.println("Circle Area = " + s.calculateArea(3.0));
    }
}