package week3.Polymorphism;

public class AxisBank extends BankInfo {


	public void deposit()
	
	{
		System.out.println("Axis Bank Minimum Deposit amount is 1000");
	}
	
	public static void main(String args[]) {
		
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
		
	}

}
