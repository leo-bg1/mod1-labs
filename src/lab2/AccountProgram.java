package lab2;

public class AccountProgram {

    public static void main(String[] args) {

        // Part 1: Create and use one Account
        Account myAccount = new Account(100, "Mike", 100.00);

        myAccount.deposit(50.00);
        myAccount.withdraw(25.00);

        System.out.println(myAccount.getDetails());

        // Part 2: Create an array of Account objects
        Account[] accounts = new Account[3];

        accounts[0] = new Account(101, "Theo", 500.00);
        accounts[1] = new Account(102, "Ryan", 400.00);
        accounts[2] = new Account(103, "Vicky", 250.00);

        for (Account account : accounts) {
            System.out.println(account.getDetails());
        }

        // Interest experiment
        myAccount.addInterest();

        System.out.println(myAccount.getDetails());

        // Two references pointing to the same Account object
        Account partnerAccount = myAccount;

        partnerAccount.addInterest();

        System.out.println(myAccount.getDetails());

        // Passing an Account reference to another method
        processAccount(myAccount);

        System.out.println(myAccount.getDetails());

        // Passing a primitive integer
        int k = 100;

        incInt(k);

        System.out.println(k);
    }

    // Adds interest to an Account object
    static void processAccount(Account acc) {
        acc.addInterest();
    }

    // Increases a copy of an integer
    private static void incInt(int x) {
        x++;
    }
}