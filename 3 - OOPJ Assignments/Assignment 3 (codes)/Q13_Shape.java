/*

Q13. Shape Drawing

Scenario: A graphics program needs to draw different shapes.

Problem Statement:
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement
draw().

Classes/Fields:
● Shape → draw() (abstract)
● Circle → radius
● Rectangle → length, breadth

Sample Input:
Circle → radius=7
Rectangle → length=5, breadth=10

Sample Output:
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10

*/

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

class Q13_Shape {
    public static void main(String args[]) 
	{
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 10);

        c.draw();
        r.draw();
    }
}
/*

PS D:\Assignment 3 (codes)> javac Q13_Shape.java
PS D:\Assignment 3 (codes)> java Q13_Shape

Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10

*/