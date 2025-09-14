class Q17_Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

class Car extends Q17_Vehicle {
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

class Bike extends Q17_Vehicle {
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

class Q17_Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.displaySpeed();
        b.displaySpeed();
    }
}