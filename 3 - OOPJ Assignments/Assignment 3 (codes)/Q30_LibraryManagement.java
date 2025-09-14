class Book {
    private int bookId;
    private String title;
    private String author;

    Book(int id, String title, String author) {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
}

abstract class LibraryMember {
    int memberId;
    String name;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book book);
}

interface Notifyable {
    void sendNotification(String message);
}

class StudentMember extends LibraryMember implements Notifyable {
    int borrowedBooks = 0;

    StudentMember(int id, String name) {
        super(id, name);
    }

    void borrowBook(Book book) {
        if (borrowedBooks < 3) {
            borrowedBooks++;
            System.out.println("StudentMember " + name + " borrowed " + borrowedBooks + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember implements Notifyable {
    int borrowedBooks = 0;

    FacultyMember(int id, String name) {
        super(id, name);
    }

    void borrowBook(Book book) {
        if (borrowedBooks < 5) {
            borrowedBooks++;
            System.out.println("FacultyMember " + name + " borrowed " + borrowedBooks + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class Q30_Main {
    public static void main(String[] args) {
        StudentMember s = new StudentMember(1, "Amit");
        FacultyMember f = new FacultyMember(2, "Prof. Singh");

        Book b1 = new Book(1, "Java Basics", "Author A");
        Book b2 = new Book(2, "OOP Concepts", "Author B");

        s.borrowBook(b1);
        s.borrowBook(b2);
        f.borrowBook(b1);
        f.borrowBook(b2);

        s.sendNotification("Return books within 7 days");
        f.sendNotification("Return books within 14 days");
    }
}