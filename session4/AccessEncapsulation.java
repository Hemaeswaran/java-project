package session4;

public class AccessEncapsulation {
	
	public static void main(String[] args) {
		Encapsulation ee = new Encapsulation();
		ee.setName("Hema");
		ee.setLocation("Coimbatore");
		
		System.out.println(ee.getName());
		System.out.println(ee.getLocation());
		
	}

}
