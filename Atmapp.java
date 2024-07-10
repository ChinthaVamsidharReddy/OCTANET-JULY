import java.util.Scanner;

/**
 * ATM Application class.
 * This class provides a simple ATM interface for users to perform various transactions.
 */
public class Atmapp {
    /**
     * Main method to start the ATM application.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Atmserver mac = new Atmserver();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\t\t\t****************** Welcome to ATM ******************\n");
        System.out.println("\n\n\t\t\t========= Please insert ATM card into machine =========\n");
        System.out.println("\n\tSelect your language :\n \n\t 1.English \n\t 2.Hindi \n\t 3.Telugu\n\t");
        int lanu = sc.nextInt();

        if (lanu == 3 || lanu == 2) {
            if (lanu == 2) {
                System.out.println("Java doesn't support Hindi language..\n Go with English language... ");
            } else {
                System.out.println("Java doesn't support Telugu language..\n Go with English language... ");
            }
        } else if (lanu == 1) {
            System.out.println("\n\tSelect your option: \n");
            System.out.println(" \n\t 1.Account balance inquiry \t\t\t\t 2.Cash withdrawal \n\t 3.Cash deposit \t\t\t\t\t 4.PIN change \n\t 5.Transaction history \t\t\t\t\t 6.Exit\n\t");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    /**
                     * Account balance inquiry option.
                     * This method will display the current account balance.
                     */
                    mac.Accountbalanceinquiry();
                    break;
                case 2:
                    /**
                     * Cash withdrawal option.
                     * This method will allow the user to withdraw cash from their account.
                     */
                    mac.Cashwithdrawal();
                    break;
                case 3:
                    /**
                     * Cash deposit option.
                     * This method will allow the user to deposit cash into their account.
                     */
                    mac.Cashdeposit();
                    break;
                case 4:
                    /**
                     * PIN change option.
                     * This method will allow the user to change their PIN.
                     */
                    mac.PINchange();
                    break;
                case 5:
                    /**
                     * Transaction history option.
                     * This method will display the user's transaction history.
                     */
                    mac.Transactionhistory();
                    break;
                default:
                    System.out.println("Exited...");
                    break;
            }
        } else {
            System.out.println("Invalid choice....");
            System.exit(0);
        }
        sc.close();
    }
}