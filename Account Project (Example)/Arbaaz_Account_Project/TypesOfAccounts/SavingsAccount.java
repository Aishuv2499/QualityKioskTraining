package TypesOfAccounts;
import AccountSystem.Account;
import AccountSystemExceptions.InsufficientBalanceException;
public class SavingsAccount extends Account
{
	public SavingsAccount(int ActNo,double RemBal)
	{	
	super(ActNo,RemBal);
	}

	public void WidrawAmt(double Amt)throws InsufficientBalanceException
	{
	double AmtLeft= Balance - Amt;
	
	if(AmtLeft < 500)
	throw new InsufficientBalanceException();
	
	if(Amt < Balance)
	Balance = Balance - Amt;
	else
	throw new InsufficientBalanceException();	
	}
	public void ActOpen()
	{
	System.out.println("Please kindly submit all the required documents to create your account");
	System.out.println("Account opening is in process");
	}
}