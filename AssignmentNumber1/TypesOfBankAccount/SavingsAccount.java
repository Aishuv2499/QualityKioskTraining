package TypesOfAccount;
import AccountSystem.Account;
import AccountSystemExceptions.InsufficientBalanceException;
public class SavingsAccount extends Account{
    public SavingsAccount(int accountNo, double balance){
	super(accountNo,balance);
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException{
	if(amount > (balance-1000)){
	    throw new InsufficientBalanceException("Insufficient Balance"); 
	}
	balance -= amount;
    }

    public void openAccount(){
	System.out.println("Saving Account Opening Process Started within few moments");
	System.out.println("Account Opening may take 2-3 working days.");
    }

}