/*

Problem 19: Vehicle Registration – Static Block
Scenario:
Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created

*/

class Q19_Vehicle {
     
     String regNo;
     String ownerName;
     String vehicleType;
	 static int vehicleCount = 0;

    
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    
   Q19_Vehicle(String ownerName, String vehicleType)
	{
        vehicleCount++;
        this.regNo = "MH-2025-" + vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    void display()
	{
        System.out.println("Reg No: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }

    public static void main(String args[]) 
	{
        Q19_Vehicle v1 = new Q19_Vehicle("Akash", "Car");
        Q19_Vehicle v2 = new Q19_Vehicle("Rohan", "Bike");

        v1.display();
        v2.display();
   
   }
}
/*
PS D:\0 - CDAC 2025\Assignment 2> javac Q19_Vehicle.java
PS D:\0 - CDAC 2025\Assignment 2> java Q19_Vehicle

Welcome to CDAC Vehicle Registration Portal
Reg No: MH-2025-1, Owner: Akash, Type: Car
Reg No: MH-2025-2, Owner: Rohan, Type: Bike
*/