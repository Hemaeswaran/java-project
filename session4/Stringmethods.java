package session4;

import java.util.Scanner;

public class Stringmethods {
	public static void main(String[] args) {
		String s1 = "java program";
		//1.length
		System.out.println(s1.length());
		
		//2.equals()
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if(username.equals("admin") && password.equals("admin@123")) {
			System.out.println("Success");
		}else {
			System.out.println("Error 404 Found ");
		}
		
		//3.equalIgnorecase()
		System.out.println("Enter username: ");
		String Username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String Password = sc.next();
		
		if(Username.equalsIgnoreCase("admin") && Password.equalsIgnoreCase("admin@123")) {
			System.out.println("Success");
		}else {
			System.out.println("Error 404 Found");
		}*/
		
		
		String s2 = "Hema";
		String s3 = "Hema";
		
		System.out.println(s2.equals(s3));
		
		//==
		/*String s4 = "Hema";
		String s5 = "Hema";
		
		System.out.println(s4==s5);*/
		String name = new String("Hema");
		String name1 = new String("Hema");
		System.out.println(name==name1);
		
		//compareTo
		//s1>s2-->positive numbers
		//s1<s2-->negative numbers
		//s1==s2-->0
		/*String s6 = "heuits";
		String s7 = "hellos";
		
		System.out.println(s6.compareTo(s7));*/
		
		
		/*String s6 = "hello";
		String s7 = "heuits";
		
		System.out.println(s6.compareTo(s7));
		
		//ConCat()
		String str1 = "Static ";
		String str2 = new String("program");
		System.out.println(str1.concat(str2));*/
		
		//toCharArray()
		String str3 = "Welcome to java";
		System.out.println("Value of method: ");
		char[] ch = str3.toCharArray();
		for(char st: ch) {
			System.out.println(st);
		}
		
		System.out.println(str3.toCharArray());
		
		/*//subString()
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(0, 9));
		
		
		//intern
		String clg = "Kgisl";
		String clg1 = new String("Kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);*/
		


	}

}
