package session3;

import java.util.Scanner;

public class nestedforloop {
public static void main (String[] args) {
	
	for(int i=1; i<=4 ; i++) {
		for(int j = 1; j<=4 ; j++) {
			System.out.println(i);
		}
	System.out.println();
	}
	
	
	// Diamond pattern printing
	int num = 6; 
	
	for(int i = 0; i<=num; i++) {
		
		for(int j = 1; j<=num-i; j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	//No.of rows by user to given for pattern printing
	System.out.println("Enter number of rows:");
	
	int rows = sc.nextInt();
	 
	 
		//Top half of diamond
	for(int i = 1; i<=rows; i++) {
		
		//Leading spaces 
		for(int j = i; j<rows; j++) {
			System.out.print(" ");
		}
		
		//Print *
		for(int k = 1; k<=(2*i-1); k++) {
			System.out.print("*");
			}
		System.out.println();
	}
	
	
	
	//Bottom half of diamond
	for(int i = rows-1; i>=1; i--) {
		//Leading spaces
	for(int j = rows; j>i; j--) {
			
			System.out.print(" ");
		}
		//print *
		for(int k = 1; k<=(2*i-1); k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}
