import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {
        int pressOption = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Holder's Name: ");
        String name = userInput.nextLine();
        System.out.println("Enter Account Type: ");
        String accType = userInput.nextLine();
        System.out.println("Enter Account Number: ");
        int accNumber =userInput.nextInt();
        System.out.println("Enter Initial Balance: ");
        double balance = userInput.nextDouble();
        System.out.println();
        System.out.println("Creating " + name + "'s Account.");

        Account acc1 = new Account(name, accNumber, accType, balance);

        while (pressOption != 5) {
            System.out.println();
            System.out.println("To Withdraw Money           :Press 1");
            System.out.println("To Deposit Money            :Press 2");
            System.out.println("To Check Balance            :Press 3");
            System.out.println("To View Account Details     :Press 4");
            System.out.println("To Exit                     :Press 5");
            pressOption =userInput.nextInt();
            switch (pressOption) {
                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    Double withdrawValue = userInput.nextDouble();
                    acc1.withdrawMoney(withdrawValue);
                    System.out.println(withdrawValue);
                    break;
                case 2:
                    System.out.print("Enter the amount you want to deposit: ");
                    Double depositValue = userInput.nextDouble();
                    acc1.depostMoney(depositValue);
                    System.out.println(depositValue);
                    break;
                case 3:
                    System.out.print("Current Account Balance is: ");
                    System.out.println(acc1.checkBalance());
                    break;
                case 4:
                    acc1.displayAccountDetails();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }
}