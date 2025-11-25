package Lab5;
import java.util.*;

class Account {
    String name;
    String accNo;
    String accType;
    double balance;

    Account(String name, String accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    SavAcct(String name, String accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    void computeInterest(double rate, int times) {
        balance = balance * Math.pow(1 + rate / 100, times);
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }
}

class CurAcct extends Account {
    double minBalance = 500;
    double penalty = 50;

    CurAcct(String name, String accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            checkMinBalance();
        } else System.out.println("Insufficient balance");
    }

    void checkMinBalance() {
        if (balance < minBalance) balance -= penalty;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter account number: ");
            String accNo = sc.nextLine();

            System.out.print("Enter account type (savings/current): ");
            String type = sc.nextLine().toLowerCase();

            System.out.print("Enter initial balance: ");
            double bal = sc.nextDouble();

            if (type.equals("savings")) {
                SavAcct s = new SavAcct(name, accNo, bal);

                int choice;
                do {
                    System.out.println("\n1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Compute Interest");
                    System.out.println("4. Display Balance");
                    System.out.println("5. Exit");
                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            s.deposit(sc.nextDouble());
                            break;

                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            s.withdraw(sc.nextDouble());
                            break;

                        case 3:
                            System.out.print("Enter interest rate: ");
                            double rate = sc.nextDouble();
                            System.out.print("Enter number of times interest applied: ");
                            int times = sc.nextInt();
                            s.computeInterest(rate, times);
                            break;

                        case 4:
                            s.displayBalance();
                            break;
                    }
                } while (choice != 5);
            }

            else if (type.equals("current")) {
                CurAcct c = new CurAcct(name, accNo, bal);

                int choice;
                do {
                    System.out.println("\n1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Display Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            c.deposit(sc.nextDouble());
                            break;

                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            c.withdraw(sc.nextDouble());
                            break;

                        case 3:
                            c.displayBalance();
                            break;
                    }
                } while (choice != 4);
            }

            sc.nextLine();
        }
    }
}
