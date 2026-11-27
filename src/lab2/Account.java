package lab2;

public class Account {

    private int id;
    private String owner;
    private double balance;

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit a negative amount.");
        } else {
            balance = balance + amount;
        }
    }

    public void addInterest() {
        balance = balance + (balance * 0.025);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance = balance - amount;
        }
    }

    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getDetails() {
        return id + ", " + owner + ", " + balance;
    }
}