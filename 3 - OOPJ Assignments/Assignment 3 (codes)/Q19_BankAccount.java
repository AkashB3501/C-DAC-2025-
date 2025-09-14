class Q19_BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    Q19_BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance);
    }
}

class SavingsAccount extends Q19_BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Interest=" + (balance * interestRate / 100));
    }
}

class CurrentAccount extends Q19_BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}

class Q19_Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Ramesh", 5000, 5);
        CurrentAccount c = new CurrentAccount(102, "Anita", 2000, 1000);

        s.calculateInterest();
        c.checkOverdraft();
    }
}