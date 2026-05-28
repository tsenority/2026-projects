package BasicJava.TinyPrograms;
import java.util.Scanner;



public class BankingApp {

    static int balance = 100;

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        while (true) { // while (true) concept is used for infinite loops till it breaks like menu, gaming app etc.

            System.out.println("===== ATM Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");


            System.out.print("Choose option: ");
            int choice = sc.nextInt();



            BankingApp b = new BankingApp(); // need to create object to call non static method from static

        switch (choice) {

            case 1:
                System.out.print("Enter Amount: ");
                int depositAmount = sc.nextInt();

                System.out.println("Balance: " + deposit(depositAmount));
                break;

            case 2:
                System.out.print("Enter Amount: ");
                int withdrawAmount = sc.nextInt();

                System.out.println("Balance " + withdraw(withdrawAmount));
                break;

            case 3:
                System.out.println("Balance: " + b.checkBalance ());
                break;

            case 4:
                System.out.println("Exiting Menu...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        System.out.println();
    }


}



    public static int deposit(int depositAmount) {
   balance = balance +depositAmount;
    return balance ;
}

public static int withdraw(int withdrawAmount) {

    if(withdrawAmount > balance){
        System.out.println("Insufficient balance");
        return balance;
    }

    balance = balance - withdrawAmount;
    return balance;


}

public int checkBalance() {
    return balance;
}


    }


   /* public static void main(String[] args) {
        //BLUEPRINT:
        //Bank has Customer's name, pin, A/c number etc.
        //Bank does withdraw, deposit, transfer, etc.
        //Logic : If deposit, withdraw,etc: affects what bank has..
        int balance= 100;
        String customerName = "Norbu";
        int pin = 6045;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an amount");
        int amount = sc.nextInt();//To get a user input

        //IfElse STATEMENT
        if(amount > balance)
            System.out.println("Insufficient fund");
        else
            System.out.println("Balance Available is"  + (balance-amount));


    }
}*/

//NestedIfElse: if, if , else--- 2ifs needs to be true before going to else.

