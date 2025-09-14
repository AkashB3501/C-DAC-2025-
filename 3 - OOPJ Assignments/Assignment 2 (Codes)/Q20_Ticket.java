/*
Problem 20: Ticket Booking System
Question:
Create a class Ticket with:
● passengerName (instance)
● ticketNo (instance, auto-generated using a static counter starting from 5001)
● Constructor to accept passengerName
● Method displayTicket() to show ticket details

Task:
Create 3 tickets and display their details.
Sample Input:
Passenger 1: Rahul
Passenger 2: Priya
Passenger 3: Amit


Sample Output:
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit

*/
class Q20_Ticket
{
   
    String passengerName;
    int ticketNo;
    static int counter = 5000;

   
    Q20_Ticket(String passengerName)
	{
        this.passengerName = passengerName;
        this.ticketNo = ++counter;  
    }

   
    void displayTicket() 
	{
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }

    public static void main(String args[])
	{
        
        Q20_Ticket t1 = new Q20_Ticket("Rahul");
        Q20_Ticket t2 = new Q20_Ticket("Priya");
        Q20_Ticket t3 = new Q20_Ticket("Amit");

      
        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac  Q20_Ticket.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java  Q20_Ticket
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit

*/