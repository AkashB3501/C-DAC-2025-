abstract class Q18_Payment {
    abstract void pay();
}

class CreditCardPayment extends Q18_Payment {
    String cardNumber;
    double amount;

    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Q18_Payment {
    String upiId;
    double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

class Q18_Main {
    public static void main(String[] args) {
        Q18_Payment p;

        p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();

        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}