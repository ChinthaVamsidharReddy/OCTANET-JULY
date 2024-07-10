import java.util.Scanner;

/**
 * ATM Server class that provides various banking services.
 */
public class Atmserver {
    Scanner sc = new Scanner(System.in);

    /**
     * Account balance inquiry service.
     * 
     * This method allows the user to check their account balance and opt for a receipt.
     * 
     * Example:
     * 
     * Atmserver atm = new Atmserver();
     * atm.Accountbalanceinquiry();
     * 
     */
    public void Accountbalanceinquiry() {
        Atmsecurity pass = new Atmsecurity();
        System.out.println("\n\tDo you need a receipt \n\t 1.YES\n\t 2.NO \n");
        int receipt1 = sc.nextInt();
        if (receipt1 == 1) {
            System.out.println("\n\tYour receipt will be generated\n");
        } else if (receipt1 == 2) {
            System.out.println("\n\tYour receipt will not generated\n");
        } else {
            System.out.println("\n\tInvalid choice\n");
            System.exit(0);
        }
        pass.Setpin();
        pass.Setbalance();
    }

    /**
     * Cash withdrawal service.
     * 
     * This method allows the user to withdraw cash and opt for a receipt.
     * 
     * Example:
     * 
     * Atmserver atm = new Atmserver();
     * atm.Cashwithdrawal();
     * 
     */
    public void Cashwithdrawal() {
        System.out.println("\n\tEnter amount to withdraw \n");
        double amount = sc.nextDouble();
        Atmsecurity pass = new Atmsecurity();
        try {
            pass.Setamount(amount);
            System.out.println(" \n\t Amount is valid \n\n\t Select YES to confirm  \n\n\t  1.YES \n\t  2.CANCLE\n");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\n\tDo you need a receipt for this transaction\n\n\t 1.YES\n\t 2.NO \n");
                int receipt = sc.nextInt();
                if (receipt == 1) {
                    System.out.println("\n\tYour receipt will be generated\n");
                } else if (receipt == 2) {
                    System.out.println("\n\tYour receipt will not generated\n");
                } else {
                    System.out.println("\n\tInvalid choice\n");
                    System.exit(0);
                }
                pass.Setpin();
                pass.Getamount(amount);
                System.out.println("\n\tCollect your amount\n");
            } else {
                System.out.println("\n\tInvalid choice\n");
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Cash deposit service.
     * 
     * This method allows the user to deposit cash and opt for a receipt.
     * 
     * Example:
     * 
     * Atmserver atm = new Atmserver();
     * atm.Cashdeposit();
     * 
     */
    public void Cashdeposit() {
        Atmsecurity pass = new Atmsecurity();
        pass.Reciptadd();
        pass.Setpin();
        System.out.println("\n\tEnter amount to deposit :  \n");
        double deposit = sc.nextDouble();
        System.out.println("\n\t 1.continue \n\t 2.cancle\n");
        int option1 = sc.nextInt();
        if (option1 == 1) {
            pass.Reciptadd();
            System.out.println("\n\t" + deposit + "  Amount is successfully deposited into your account\n");
        } else if (option1 == 2) {
            System.out.println("\n\tTransaction is cancelled\n");
        } else {
            System.out.println("\n\tInvalid option\n");
            System.exit(option1);
        }
    }

    /**
     * PIN change service.
     * 
     * This method allows the user to change their PIN.
     * 
     * Example:
     * Atmserver atm = new Atmserver();
     * atm.PINchange();
     */
    public void PINchange() {
        Atmsecurity pass = new Atmsecurity();
        try {
            pass.Setpin();
            System.out.println("\n\tEnter your new PIN : \n");
            int newpin = sc.nextInt();
            System.out.println("\n\tRe-Enter your new PIN : \n");
            int newpin1 = sc.nextInt();
            if (newpin == newpin1) {
                System.out.println("\n\tPIN is successfully changed\n");
            } else {
                System.out.println("\n\tThe new PIN and Re-Enter PIN do not match. Please try again.\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
     *
     * Transaction history service.
     * 
     * This method check the users Transaction history.
     * 
     * Example:
     * Atmserver atm = new Atmserver();
     * pass.Transactionhistory();;
     */
    
    public void Transactionhistory(){
        Atmsecurity pass=new Atmsecurity();
        pass.Setpin();
        pass.Transactionhistory();
    }
}
