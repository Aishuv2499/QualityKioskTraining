package AccountOperation;

import java.util.Scanner;

//parent class
class defaultmethods {
    int accountNumber;
    double Balance;
    String accountHolder;
    String accountType;
    final double minBalance=500;

    //constructor
    public defaultmethods(int accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        Balance = balance;
        this.accountHolder = accountHolder;
    }

    public defaultmethods(int accountNumber, double balance, String accountHolder, String accountType) {
        this.accountNumber = accountNumber;
        Balance = balance;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }
}

//child class
public class Account extends defaultmethods{

    //super
    public Account(int accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    //constructor overloading
    public Account(int accountNumber, double balance, String accountHolder, String accountType) {
        super(accountNumber, balance, accountHolder, accountType);
    }

    int ans=1;
    Scanner sc = new Scanner(System.in);
    public void opeartions()
    {
        while (ans==1) {
        System.out.println("Choose one of the following option" +
                "\n 1. Check Balance" +
                "\n 2. Deposite Money" +
                "\n 3. Withdraw Money"
                );

        int choice = sc.nextInt();

          if (choice == 1) {

              //To check current balance
              System.out.println("Your Current Balance is " + Balance);

              //for saving account, balance can be 0
              if (accountType != "Saving") {
                  if (Balance < minBalance) {
                      System.out.println("Your Balance is less than 500. You should have balance more than 500");
                  }
              }
          }

          //for depositing money into account
          if (choice == 2) {
              System.out.println("Enter amount for deposite: ");
              int amount = sc.nextInt();
              System.out.println("Your previous balance was "+Balance);
              Balance = Balance + amount;
              System.out.println("Now Your Total Balance is " + Balance);
          }

          //for withdraw money from your account
          if (choice == 3) {
              System.out.println("Enter amount for Withdraw: ");
              int am = sc.nextInt();

              //checking balance
              if(am>Balance) {
                  System.out.println("Your previous balance was " + Balance);
                  Balance = Balance - am;
                  System.out.println("You have removed " + am + " and Now Your Balance is " + Balance);
              }
              else if(am<Balance && am<minBalance){
                  System.out.println("You dont sufficient balance");
              }
          }

          //for using same bank account again
          System.out.println("Do You Want to Continue with same account " +
                  "\n 1. Yes" +
                  "\n 2. No");
          ans = sc.nextInt();

          if (ans == 2) {
              ans=1;
              System.out.println("Thank you " +accountHolder);
              break;
          }
      }
    }

}
