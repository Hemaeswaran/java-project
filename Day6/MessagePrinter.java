package Day6;

public class MessagePrinter implements Runnable {
	public void run() {
		System.out.println("Message from thread:" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Runnable task = new MessagePrinter();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
	}

}
