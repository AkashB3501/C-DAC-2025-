abstract class Q29_Employee {
    String name;
    int id;

    Q29_Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class PermanentEmployee extends Q29_Employee implements BonusEligible {
    double basicSalary, hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    double calculateSalary() {
        return basicSalary + hra;
    }

    public double calculateBonus() {
        return calculateSalary() * 0.10;
    }
}

class ContractEmployee extends Q29_Employee {
    double hourlyRate, hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

interface BonusEligible {
    double calculateBonus();
}

class Q29_Main {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee("Amit", 1, 50000, 5000);
        ContractEmployee c = new ContractEmployee("Neha", 2, 300, 100);

        System.out.println(p.name + " Salary = " + p.calculateSalary() + ", Bonus = " + p.calculateBonus());
        System.out.println(c.name + " Salary = " + c.calculateSalary());
    }
}