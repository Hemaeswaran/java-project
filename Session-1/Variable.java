package programs;

public class Variable {
	
	int a = 25 ;
	static int b = 50;
	
	
	void display() {
		int d = 60;
		System.out.println("method inside variable:"+d);
	}
	
	public static void main(String[] args) {
		int c = 75;
		
		
		Variable obj1 = new Variable();
		System.out.println(obj1.a);
		obj1.display();
		System.out.println(b);
		System.out.println(c);
		
		Variable2.show();
		
		
	}

}
