package Day6;

public class SleepJoin extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + "course:" + i);
			try {
				Thread.sleep(500);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		}
			
		}
		public static void main(String[] args) {
			SleepJoin t1 = new SleepJoin();
			SleepJoin t2 = new SleepJoin();
			
			t1.start();
			try {
				t1.join();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			t2.start();
		
	}

}
