package AccountSystemDemo;

import AccountSystem.NewAccount;
import AccountSystemExceptions.InsufficientBalanceException;
import TypesOfAccounts.NewSalaryAccount;
import TypesOfAccounts.NewSavingAccount;

public class AccountSystem {

	public static void main(String[] args) {


		NewAccount Act1 = new NewAccount("ROSS TAYLOR",8000.00);

		Act1.deposit(1000.00);

		System.out.println("ACCOUNT HOLDER NAME- "+Act1.Get_Account_HolderName()+  " INITIAL BALANCE- "+Act1.GetBalance());
		try {
			Act1.WithdrawAmount(500.00);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.out.println("Sorry.!! You don't have sufficient balance in AccountNo: " + Act1.Get_Account_HolderName());
		}
		System.out.println("After withdrawal balance of " + Act1.Get_Account_HolderName() + " is Rs." + Act1.GetBalance() + "/-");

		NewAccount Act2 = new NewAccount("TRENT BOULT",2000.00);
		Act2.deposit(1000.00);
		System.out.println("ACCOUNT HOLDER NAME- "+Act2.Get_Account_HolderName()+ " INITIAL BALANCE- "+Act2.GetBalance()+"/-");
		try {
			Act2.WithdrawAmount(10000.00);
			System.out.println("After withdrawal balance of " + Act2.Get_Account_HolderName() + " is Rs." + Act2.GetBalance() + "/-");
		} catch (InsufficientBalanceException e) {

			System.out.println("Sorry.!! You don't have sufficient balance in AccountNo: " + Act2.GetBalance());
		}

		NewSavingAccount SavAcnt1=new NewSavingAccount("ROSS TAYLOR",8000.00);
		SavAcnt1.OpenAccount();
		System.out.println("ACCOUNT HOLDER NAME- "+SavAcnt1.Get_Account_HolderName()+" INITIAL BALANCE- "+SavAcnt1.GetBalance()+"/-");
		SavAcnt1.deposite(5000.00);
		System.out.println("After deposit balance of AccountNo: "+SavAcnt1.Get_Account_HolderName()+" is Rs. "+SavAcnt1.GetBalance());
		try
		{
			SavAcnt1.WithdrawAmount(6000.00);
			System.out.println("After withdrawal balance of "+SavAcnt1.Get_Account_HolderName()+" is Rs."+SavAcnt1.GetBalance()+"/-");
		}
		catch(InsufficientBalanceException Ex)
		{
			System.out.println("Sorry.!! You don't have sufficient balance in AccountNo: "+SavAcnt1.Get_Account_HolderName());
		}
		SavAcnt1.CloseAccount();

		NewSalaryAccount SalAcnt2=new NewSalaryAccount("Smith");
		SalAcnt2.OpenAccount();
		System.out.println("ACCOUNT HOLDER NAME- "+SalAcnt2.Get_Account_HolderName()+" INITIAL BALANCE- "+SalAcnt2.GetBalance()+"/-");
		SalAcnt2.deposit(5000.00);
		System.out.println("Salary Credited of AccountNo: "+SalAcnt2.Get_Account_HolderName()+" Available Balance is "+SalAcnt2.GetBalance());

		try
		{
			SalAcnt2.WithdrawAmount(11000.00);
			System.out.println("After withdrawal balance of "+SalAcnt2.Get_Account_HolderName()+" is Rs."+SalAcnt2.GetBalance()+"/-");
		}
		catch(InsufficientBalanceException Ex)
		{
			System.out.println("Sorry.!! You don't have sufficient balance in AccountNo: "+SalAcnt2.Get_Account_HolderName());
		}
		SavAcnt1.CloseAccount();


	}

}