package Day6;

public class NumberPrinter extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Number:" + i);
		}
	}
	public static void main(String[] args) {
		NumberPrinter thread = new NumberPrinter();
		thread.start();
	}

}
