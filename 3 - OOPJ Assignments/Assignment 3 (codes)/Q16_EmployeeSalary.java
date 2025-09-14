class Q16_Employee {
    String name;
    double salary;

    Q16_Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Salary = " + salary);
    }
}

class Manager extends Q16_Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + (salary + salary * 0.20));
    }
}

class Developer extends Q16_Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + (salary + salary * 0.10));
    }
}

class Q16_Main {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);

        m.displaySalary();
        d.displaySalary();
    }
}