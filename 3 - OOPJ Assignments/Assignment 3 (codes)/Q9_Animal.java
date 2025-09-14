/*
Q9. Animal Sound
Scenario: You are building a zoo management system to play animal sounds.
Problem Statement:
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
Classes/Fields:
● Animal → makeSound()
● Dog → “Bark”
● Cat → “Meow”
Sample Output:
Dog → Bark
Cat → Meow

*/

class Animal 
{
    void makeSound() 
	{
        System.out.println("Some sound...");
    }
}

class Dog extends Animal 
{
    void makeSound() 
	{
        System.out.println("Dog -> Bark");
    }
}

class Cat extends Animal 
{
    void makeSound() 
	{
        System.out.println("cat -> Meow");
    }
}

class Q9_Animal 
{
    public static void main(String args[])
	{
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q9_Animal.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q9_Animal

Dog -> Bark
cat -> Meow

*/