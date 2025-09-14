/*
Q6. Shape Area Calculation
Scenario: You are designing a program to calculate areas of different shapes.
Problem Statement:
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement
area() in each subclass.
Classes/Fields:
● Shape → area() (method stub)
● Rectangle → length, breadth
● Circle → radius
Methods:
● Rectangle.area() → length × breadth
● Circle.area() → π × radius²
Sample Input:
Rectangle → length=5, breadth=10
Circle → radius=7
Sample Output:
Rectangle Area = 50
Circle Area = 153.86
*/

import java.util.Scanner;

abstract class Shape 
{
    abstract double area();
}

class Rectangle extends Q6_Shape 
{
    double length, breadth;

    Rectangle(double l, double b) 
	{
        length = l;
        breadth = b;
    }

    double area() {
		
        return length * breadth;
		
    }
}

class Circle extends Shape {
	
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Q6_AreaCalculation
 {
	
    public static void main(String args[])
	{
        double len, bre, ra;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        len = sc.nextDouble();

        System.out.print("Enter the breadth: ");
        bre = sc.nextDouble();

        System.out.print("Enter the radius: ");
        ra = sc.nextDouble();

        Rectangle r = new Rectangle(len, bre);
        Circle c = new Circle(ra);

    System.out.printf("Rectangle Area = %.0f\n", r.area()); 
	
    System.out.printf("Circle Area = %.2f\n", c.area());   


      
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q6_AreaCalculation.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q6_AreaCalculation

Enter the length: 5
Enter the breadth: 10
Enter the radius: 7
Rectangle Area = 50
Circle Area = 153.94

*/