package week3assignment;


public class Axisbank extends BankInfo {

	public void deposit(int balance) {		//overloading
			System.out.println("Deposit amount : Axis Bank " + balance);
			
	}
	
	public void deposit() {			//overiding
		System.out.println("fixed deposit : Axis Bank");
	}
	
}