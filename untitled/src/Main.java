import java.util.*;

class ATM {
    float Balance;
    int PIN = 9091;

    public void checkpin() {
        System.out.print("Enter Your PIN : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int enterIN = sc.nextInt();

        if (enterIN == PIN) {

            menu();
        } else {
            System.out.println("Enter a valid PIN...!");
            checkpin();
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("----------------   Options   ---------------");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter Your Choice : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("--------------- Thank You-------------------------------------------");
            System.out.println();
            System.out.println();
            return;
        } else {
            System.out.println("Enter a valid Choice...!");
        }

    }

    // To Check Balance Option
    public void checkBalance() {
        System.out.println("Your Balance : " + Balance);
        System.out.println();
        System.out.print("Press 0 for exit OR Press 1 for menu : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int lastchoice = sc.nextInt();

        if (lastchoice == 0) {
            System.out.println();
            System.out.println();
            System.out.println("----------------------------- Thank You -----------------------------");
            System.out.println();
            System.out.println();
            return;
        } else if (lastchoice == 1) {
            menu();
        } else {
            System.out.println("Enter a valid Input...!");
        }
    }

    // To withdraw Money Option
    public void withdrawMoney() {
        System.out.print("Enter the Amount to Withdraw : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance) {
            System.out.println("Insufficient Balance...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            if (lastchoice == 0) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------- Thank You -----------------------------");
                System.out.println();
                System.out.println();
                return;
            } else if (lastchoice == 1) {
                menu();
            } else {
                System.out.println("Enter a valid Input...!");
            }
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawal Successful...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            if (lastchoice == 0) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------- Thank You -----------------------------");
                System.out.println();
                System.out.println();
                return;
            } else if (lastchoice == 1) {
                menu();
            } else {
                System.out.println("Enter a valid Input...!");
            }

        }
    }

    // TO deposit money Option
    public void depositMoney() {
        System.out.print("Enter the Amount to Deposit : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount < 0) {
            System.out.println("Invalid Input...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            if (lastchoice == 0) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------- Thank You -----------------------------");
                System.out.println();
                System.out.println();
                return;
            } else if (lastchoice == 1) {
                menu();
            } else {
                System.out.println("Enter a valid Input...!");
            }
        } else {
            Balance = Balance + amount;
            System.out.println("Money Deposited Successfully...!");
            System.out.println();
            System.out.print("Press 0 for exit OR Press 1 for menu : ");
            int lastchoice = sc.nextInt();

            if (lastchoice == 0) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------- Thank You -----------------------------");
                System.out.println();
                System.out.println();
                return;
            } else if (lastchoice == 1) {
                menu();
            } else {
                System.out.println("Enter a valid Input...!");
            }
        }
    }
}



public class ATM {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("<------------------------------- Welcome ------------------------------->");
        System.out.println();
        System.out.println();
        ATM obj = new ATM();
        obj.checkpin();
    }

}

