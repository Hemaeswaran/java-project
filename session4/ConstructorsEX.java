package session4;

public class ConstructorsEX {
	
	public ConstructorsEX() {
		System.out.println("Default constructor");
	}
	
	public ConstructorsEX(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized Constructors");
		
	}
	
	 public int sum(int a, int b) {
		 int res = a + b;
		 return res;
		 
	 }
	 
	 public static void main(String[] args) {

		 ConstructorsEX ce = new ConstructorsEX();
		 ConstructorsEX ce1 = new ConstructorsEX("Hema", "19");
		 System.out.println(ce.sum(5,  10));
		 
		 
	 }

}
