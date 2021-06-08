package AccountSystem;
import AccountSystemExceptions.InsufficientBalanceException;
public abstract class Account
{
	private int ActNo;
	protected double RemBal;
	static final double InterestRate=10.00;
	public Account(int n1)
	{
		ActNo = n1;
		RemBal = 0.0;
	}

	public Account(int n1,double bal)
	{
		this.ActNo = n1;
		RemBal = bal;
	}
	
	public void DepAmt(double Amt)
	{

		RemBal = RemBal + Amt;
	}
	public double GetBalance()
	{
		return RemBal;
	}

	public void WidrawAmt(double Amt)throws InsufficientBalanceException
	{
		if(RemBal < Amt)
		throw new InsufficientBalanceException();
		RemBal = RemBal -Amt;
	}
	
	public int Get_ActNo()
	{
		return ActNo;
	}

	public void InterestReceived()
	{
		double InterestReceived=(RemBal * InterestRate)/100;
		RemBal = RemBal +InterestReceived;
	}

	public final void ActClose()                // final method overriding
	{
		System.out.println("Application Submission");
		System.out.println("Withdraw all Ammount");
		System.out.println("Account will be closed in 24 hours");
	}
	
	public abstract void ActOpen();             // Abstract method
	
}