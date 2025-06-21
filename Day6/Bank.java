package Day6;

public class Bank {
	int balance = 500;
	
	synchronized void withdraw(int amount) {
		String name = Thread.currentThread().getName();
		System.out.println(name + "trying to withdraw" + amount);
		if(balance >= amount) {
			try { Thread.sleep(200); } catch (Exception e) {}
			balance -= amount;
			System.out.println(name + "withdrawn.Balance:" + balance);
		} else {
			System.out.println(name + "failed.Insufficient balance.");
		}
	}



	public static void main(String[] args) {
		Bank b = new Bank();
		
		Runnable r = () -> b.withdraw(200);
		new Thread(r, "User-1").start();
		new Thread(r, "User-2").start();
		new Thread(r, "User-3").start();
		
	}
}
