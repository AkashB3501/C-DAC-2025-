/*
Q5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
Sample Input:
temperature = -5
Sample Output:
“Temperature out of range”

*/

import java.util.Scanner;

class Q5_TemperatureSensor 
{
    private int temperature;

    public void setTemperature(int t)
	{
        if (t >= 0 && t <= 100) 
		{
            this.temperature = t;
            System.out.println("Temperature = " + this.temperature);
        } 
		else 
		{
            System.out.println("Temperature out of range");
        }
    }

    public int getTemperature() 
	{
        return temperature;
    }

    public static void main(String args[]) 
	{
        int Temp;

        Scanner sc = new Scanner(System.in);

        Q5_TemperatureSensor t = new Q5_TemperatureSensor();

        System.out.print("Enter temperature: ");
        Temp = sc.nextInt();

        t.setTemperature(Temp);

       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q5_TemperatureSensor.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q5_TemperatureSensor

Enter temperature: -5
Temperature out of range

*/