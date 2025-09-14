/*
Problem 1: Counter for Cups
Scenario: You are keeping track of how many cups of tea are prepared in your home.
Requirements:
1. Create a class TeaCup with instance variable: teaType (String).
2. Create a static variable totalCups to count all cups created.
3. Constructor should initialize teaType and increment totalCups.
4. Create getter for teaType.
5. Create a static method showTotalCups() to print total cups.
Input Example:
Cup1: teaType = "Masala Tea"
Cup2: teaType = "Green Tea"
Cup3: teaType = "Ginger Tea"
Expected Output:
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3

 */

class Q1_TeaCup {

    String teaType;
    static int totalcups = 0;

    Q1_TeaCup(String teaType) {
        this.teaType = teaType;
        totalcups++;

    }

    String getTeaType() {
        return teaType;
    }

    static void showTotalCups() {
        System.out.println("Total cups made: " + totalcups);

    }

    public static void main(String args[]) {
        Q1_TeaCup cup1 = new Q1_TeaCup("Masala Tea");
        Q1_TeaCup cup2 = new Q1_TeaCup("Green Tea");
        Q1_TeaCup cup3 = new Q1_TeaCup("Ginger Tea");

        System.out.println("Cupe type: " + cup1.getTeaType());
        System.out.println("Cupe type: " + cup2.getTeaType());
        System.out.println("Cupe type: " + cup3.getTeaType());

        showTotalCups();

    }
}

/*
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac TeaCup.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java TeaCup

Cupe type: Masala Tea
Cupe type: Green Tea
Cupe type: Ginger Tea
Total cups made: 3

*/
