package BankOfBharat;
import AccountOperation.Account;

import java.util.Scanner;

//this main class which contains Main methods
public class Bank {
    public static void main(String[] args) {
        //objects of Account class
        Account o1 = new Account(1, 2500, "Aishwarya");
        Account o2 = new Account(2, 5000, "Kansu");
        Account o3=new Account(3, 200, "Khuda","Saving");
        Account o4=new Account(4, 200, "Khuda","Current");

        Scanner sc = new Scanner(System.in);
        int number;
        int a = 1;

        while (a == 1) {
            System.out.println("Enter your Account Number: ");
            number = sc.nextInt();

            if(number==1){
                o1.opeartions();
            }

            else if (number == 2) {
                o2.opeartions();
            }
            else if (number == 3) {
                o3.opeartions();
            }
            else if (number == 4) {
                o4.opeartions();
            }
            System.out.println("Do You Want to open another account " +
                    "\n 1. Yes" +
                    "\n 2. No");
            a = sc.nextInt();

            if (a == 2) {
                a=1;
                System.out.println("Thank you ");
                break;
            }
        }
    }
}
