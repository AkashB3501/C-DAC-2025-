class Q21_Staff {
    String name;
    int staffId;

    Q21_Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}

class Doctor extends Q21_Staff {
    String specialization;

    Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Q21_Staff {
    String shift;

    Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}

class Q21_Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse n = new Nurse("Nisha", 102, "Night");

        d.displayDetails();
        n.displayDetails();
    }
}