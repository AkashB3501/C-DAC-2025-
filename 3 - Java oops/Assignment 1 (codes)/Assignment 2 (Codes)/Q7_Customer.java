/*
Problem 7: Indian Movie Ticket Booking

Scenario:
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with
ticket type. Keep track of total tickets sold using a static counter.
Tasks:
1. Create a Customer class.
2. Implement two constructors:
Constructor 1 → Customer(String name)
Constructor 2 → Customer(String name, String ticketType)
3. Static counter to track tickets sold.
4. Print customer details and total tickets sold.
Input Example:
Customer1: "Rahul"
Customer2: "Pooja", "Premium"
Customer3: "Amit"
Expected Output:
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Ami

*/

class Q7_Customer {
	
    String name;
    String ticketType;
    static int ticketCount = 0;

    Q7_Customer(String name) 
	{
        this.name = name;
        this.ticketType = "Normal";
        ticketCount++;
    }

    Q7_Customer(String name, String ticketType) 
	{
        this.name = name;
        this.ticketType = ticketType;
        ticketCount++;
    }

    void CustomerDetails() 
	{
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }

    static int TotalTicketsSold() 
	{
        return ticketCount;
    }

    public static void main(String args[]) 
	{
        Q7_Customer c1 = new Q7_Customer("Rahul");
        Q7_Customer c2 = new Q7_Customer("Pooja", "Premium");
        Q7_Customer c3 = new Q7_Customer("Amit");

        System.out.print("Customer1: ");
        c1.CustomerDetails();

        System.out.print("Customer2: ");
        c2.CustomerDetails();

        System.out.print("Customer3: ");
        c3.CustomerDetails();

        System.out.println("Total Tickets Sold: " + Q7_Customer.TotalTicketsSold());
    }
}
/*
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3

*/