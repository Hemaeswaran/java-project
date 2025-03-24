package session5;

public class AccessFoodMenu implements VegItems, NonVegItems {

	@Override
	public void fry() {
		System.out.println("Chicken fry, Prawn fry");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy, Mushroom gravy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakFast() {
		System.out.println("Ghee roast,Podi roast");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunch() {
		System.out.println("Cheese pasta, Chicken rice");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}

}
