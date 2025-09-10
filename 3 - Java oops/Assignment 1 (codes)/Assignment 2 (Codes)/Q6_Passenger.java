/*
Problem 6: Indian Railway Ticket Booking

Scenario:
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and
age or name, age, and seat type. The system should also count the total tickets booked using a static
counter.
Tasks:
1. Create a Passenger class.
2. Implement two constructors (constructor overloading):
Constructor 1 → Passenger(String name, int age)
Constructor 2 → Passenger(String name, int age, String seatType)
3. Use a static counter to keep track of total passengers booked.
4. Print passenger details and total passengers.
Input Example:
Passenger1: "Ravi", 25
Passenger2: "Anita", 30, "AC Sleeper"
Passenger3: "Suresh", 40
Expected Output:
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3

*/

class Q6_Passenger
{
	
  String name;
  int age;
  String seatType;
  
  static int totalPassengers = 0;
  
  Q6_Passenger(String name,int age)
  {
	  this.name=name;
	  this.age=age;
	  this.seatType="General";
	  totalPassengers++;
	  
  }
  
   Q6_Passenger(String name,int age,String seatType)
  {
	  this.name=name;
	  this.age=age;
	  this.seatType=seatType;
	 
	  totalPassengers++;
	  
  }
  void  passengeDetails()
  {
	  System.out.println("Name: " + name + ", Age: "+ age +", seat: " +seatType);
	
  }	
  
  static void showTotalPassengers()
  {
	  
	  System.out.println("Total Passengers Booked: "+totalPassengers);
	  
  }
	  
  public static void main(String args[])
  {
	  Q6_Passenger p1 = new Q6_Passenger("Ravi",25);
	  Q6_Passenger p2 = new Q6_Passenger("Anita",30,"AC Sleeper");
	  Q6_Passenger p3 = new Q6_Passenger("Suresh",40);
	  
	    System.out.print("Passenger1: ");
        p1.passengeDetails();

        System.out.print("Passenger2: ");
        p2.passengeDetails();

        System.out.print("Passenger3: ");
        p3.passengeDetails();
	  
	  Q6_Passenger.showTotalPassengers();
	  
  }

}

/*
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac Q6_Passenger.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java Q6_Passenger
Passenger1: Name: Ravi, Age: 25, seat: General
Passenger2: Name: Anita, Age: 30, seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, seat: General
Total Passengers Booked: 3

*/