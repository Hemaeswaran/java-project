package programs;

public class bitwise {
	public static void main(String[] args) {
		
		int a = 5, b = 3; //binary 5-->0101, 3-->0011
		
		System.out.println("Bitwise AND:"+ (a & b));
		System.out.println("Bitwise OR:"+ (a | b));
		System.out.println("Bitwise XOR:"+ (a ^ b));
		System.out.println("Bitwise NOT:"+ (~a));
		
	}

}
