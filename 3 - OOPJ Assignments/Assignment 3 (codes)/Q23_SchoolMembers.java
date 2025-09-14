class Q23_Member {
    String name;
    int id;

    Q23_Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id);
    }
}

class Teacher extends Q23_Member {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Subject=" + subject);
    }
}

class Student extends Q23_Member {
    int grade;

    Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Grade=" + grade);
    }
}

class Staff extends Q23_Member {
    String department;

    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Department=" + department);
    }
}

class Q23_Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Kumar", 101, "English");
        Student s = new Student("Riya", 201, 10);
        Staff st = new Staff("Mr. Das", 301, "Maintenance");

        t.displayInfo();
        s.displayInfo();
        st.displayInfo();
    }
}