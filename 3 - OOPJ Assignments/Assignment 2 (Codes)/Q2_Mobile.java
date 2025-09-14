
/*
Problem 2: Simple Mobile Tracker
Scenario: A shop wants to count how many mobiles are added to their inventory.
Requirements:
1. Create a class Mobile with instance variable: model (String).
2. Create a static variable totalMobiles to count total mobiles added.
3. Constructor should initialize model and increment totalMobiles.
4. Create a getter for model.
5. Create a static method showTotalMobiles() to print total mobiles.
Input Example:
Mobile1: model = "Samsung Galaxy M32"
Mobile2: model = "Redmi Note 12"
Expected Output:
Mobile1 model: Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2

 */
class Q2_Mobile {

    String model;
    static int totalMobiles = 0;

    Q2_Mobile(String model) {
        this.model = model;
        totalMobiles++;

    }

    String getModel() {
        return model;

    }

    static void ShowTotalMobile() {
        System.out.println("Total mobiles in stock : " + totalMobiles);

    }

    public static void main(String args[]) {

        Q2_Mobile m1 = new Q2_Mobile("Samsung Galaxy M32");
        Q2_Mobile m2 = new Q2_Mobile("Redmi Note 12");

        System.out.println("Mobile1 model:" + m1.getModel());
        System.out.println("Mobile2 model:" + m2.getModel());

        Q2_Mobile.ShowTotalMobile();

    }

}

/*

PS D:\0 - Assignment 2 (Codes)> javac Mobile.java
PS D:\0 - Assignment 2 (Codes)> java Mobile
Mobile1 model:Samsung Galaxy M32
Mobile2 model:Redmi Note 12
Total mobiles in stock : 2

*/
