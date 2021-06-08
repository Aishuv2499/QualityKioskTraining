package TypesOfAccounts;
import AccountSystem.Account;
import AccountSystemExceptions.InsufficientBalanceException;
public class SalaryAccount extends Account
{
	public SalaryAccount(int ActNo)
	{
	super(ActNo);
	}	
	public void ActOpen()
	{
	System.out.println("Account will be opened in 12 hours");
	}	

}