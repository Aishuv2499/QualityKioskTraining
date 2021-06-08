package TypesOfAccount;
import AccountOpetaions.Account;
import AccountSystemExceptions.InsufficientBalanceException;
public class SalaryAccount extends Account{
    public SalaryAccount(int accountNo){
	super(accountNo);
    }

    public void openAccount(){
	System.out.println("Salary Account Opening Process Started within a moment");
	System.out.println("Account Opening may take 2-3 Working days.");
    }
}