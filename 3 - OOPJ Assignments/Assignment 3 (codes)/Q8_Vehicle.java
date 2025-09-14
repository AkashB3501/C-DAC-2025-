/*
Q8. Vehicle Types
Scenario: You want to categorize vehicles.
Problem Statement:
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType.
Display details of each vehicle.
Classes/Fields:
● Vehicle → brand, speed
● Car → modelType
● Bike → modelType
Sample Input:
Car → brand=Honda, speed=180, modelType=Civic
Bike → brand=Yamaha, speed=120, modelType=R15
Sample Output:
Car → Honda Civic, Speed=180
Bike → Yamaha R15, Speed=120
*/

class Vehicle 
{
    String brand;
    int speed;

    Vehicle(String brand, int speed) 
	{
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle
 {
    String modelType;

    Car(String brand, int speed, String modelType)
	{
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() 
	{
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Bike extends Vehicle 
{
    String modelType;

    Bike(String brand, int speed, String modelType)
	{
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() 
	{
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Q8_Vehicle
 {
    public static void main(String args[]) 
	{
        Car c = new Car("Honda", 180, "Civic");
        Bike b = new Bike("Yamaha", 120, "R15");

        c.display();
        b.display();
		
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q8_Vehicle.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q8_Vehicle

Car ? Honda Civic, Speed=180
Bike ? Yamaha R15, Speed=120
*/