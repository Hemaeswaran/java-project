package session5;

public class AccessBirdAction extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird Flys....");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		AccessBirdAction aba = new AccessBirdAction();
		aba.eat();
		aba.fly();
	}
		

}
