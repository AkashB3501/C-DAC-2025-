 
 /*
 
 Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details

 */
 class Q18_Vehicle {
	
     String regNo;
     String ownerName;
     String vehicleType;

     static int vehicleCount = 1;

   
    Q18_Vehicle(String ownerName, String vehicleType) 
	{
        this.regNo = "MH-2025-" + vehicleCount++;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
  
    String getRegNo()
	{
        return regNo;
    }

    String getOwnerName() 
	{
        return ownerName;
    }

    String getVehicleType() 
	{
        return vehicleType;
    }

    
    void display() 
	{
        System.out.println("Reg No: " + regNo +", Owner: " + ownerName +", Type: " + vehicleType);
    }
   
    public static void main(String args[]) 
	{
        Q18_Vehicle v1 = new Q18_Vehicle("Akash", "Car");
        Q18_Vehicle v2 = new Q18_Vehicle("Rahul", "Bike");

        v1.display();
        v2.display();
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 2> javac Q18_Vehicle.java
PS D:\0 - CDAC 2025\Assignment 2> java Q18_Vehicle

Reg No: MH-2025-1, Owner: Akash, Type: Car
Reg No: MH-2025-2, Owner: Rahul, Type: Bike

*/