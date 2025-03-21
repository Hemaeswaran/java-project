package session4;

import java.util.Scanner;

public class Assessment {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the number:");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the number:");
		int num3 = scanner.nextInt();
		
		int greatest = Math.max(num1,  Math.max(num2,  num3));
		
		System.out.println("The greatest number is: "+greatest);
		System.out.println();
		
		
	}

}
