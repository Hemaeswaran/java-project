package session7;

public class ThrowsEx {
	
	public static int divideNumber(int m, int n) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int div = m/n;
		
		String[] name = {"java", "python", "node"};
		
		System.out.println(name[3]);
		
		return div;
   }
	public static void main(String[] args) {
		ThrowsEx te = new ThrowsEx();
		
		try {
			System.out.println(divideNumber(45, 0));
			
		}catch(ArithmeticException e) {
			System.out.println("\n Number cannot be divided by 0");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array indexed is out of bound");
		}
	}

}
