import java.util.Scanner;

/**
 * ATM Security class that handles PIN verification, balance management, and transaction history.
 */
public class Atmsecurity {
    private Scanner sc = new Scanner(System.in);
    private int pin = 5151;
    private double balance = 100000.0;

    /**
     * Sets the PIN number for the ATM account.
     */
    public void Setpin() {
        System.out.println("\n\tEnter your pin number\n");
        int userpin = sc.nextInt();
        if (pin == userpin) {
            System.out.println("\n\tpin is correct\n");
        } else {
            System.out.println("\n\tpin is incorrect\n");
            System.exit(0);
        }
    }

    /**
     * Withdraws a specified amount from the account balance.
     * 
     * @param amount the amount to withdraw
     * @example Setamount(500.0) // withdraws 500.0 from the account balance
     */
    public void Getamount(double amount) {
        if (amount < balance) {
            double current = balance - amount;
            Reciptadd();
            System.out.println("\n\tAvaliable balance is : " + (current) + "\n");
        }
    }

    /**
     * Displays the current account balance.
     * 
     * @example Setbalance() // displays the current account balance
     */
    public void Setbalance() {
        Reciptadd();
        System.out.println(balance);
    }

    /**
     * Deposits a specified amount into the account balance.
     * 
     * @param amount the amount to deposit
     * @example Setamount(1000.0) // deposits 1000.0 into the account balance
     */
    public void Setamount(double amount) {
        if (amount > balance) {
            balance += amount;
            System.out.println("\n\tInsufficient balance...\n");
            System.exit(0);
        }
    }

    /**
     * Simulates a transaction processing delay.
     */
    public void Reciptadd() {
        String str = "\n\tplease wait while your transaction is  being processed....\n";
        try {
            synchronized (str) {
                System.out.println(str);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Displays the transaction history.
     * 
     * @example Transactionhistory() // displays the transaction history
     */
    public void Transactionhistory() {
        if (balance > 100000.0) {
            double Transaction = balance - 100000.0;
            System.out.println("\n\tYour transaction history is : \t\n Credited amount : " + Transaction + "\n");
        } else if (balance < 100000.0) {
            double Transaction = 100000.0 - balance;
            System.out.println("\n\tYour transaction history is : \t\n Debit amount : " + Transaction + "\n");
        } else {
            System.out.println("\n\tYour transaction history is : \t\n No transaction\n");
        }
    }
}