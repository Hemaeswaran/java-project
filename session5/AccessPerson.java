package session5;

public class AccessPerson {
	public static void main(String[] args) {
		
		//original person object
		Person originalPerson = new Person("Hema", 19);
		
		//copied person object
		Person copiedPerson = new Person(CopiedPerson);
		
		System.out.println("Original Person:");
		originalPerson.displayInfo();
		
		System.out.println("Copied Person:");
		CopiedPerson.displayInfo();
	}

}
