package Day3;


public class BankAccount {
	double balance;
	
	public void deposit(double amt) {
		balance += amt;
		System.out.println("deposited:" + amt);
		
	}
	public void withdraw(double amt) {
		if(amt <= balance) {
			balance -= amt;
			System.out.println("withdrawn:" + amt);
		}
		else {
			System.out.println("insufficient balance!");
			
		}
	}
	public void showbalance() {
		System.out.println("balance:" + balance);
	}

}
