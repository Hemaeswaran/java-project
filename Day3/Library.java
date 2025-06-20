package Day3;


import java.util.ArrayList;

public class Library {
	ArrayList<String> books = new ArrayList<>();
	void addBook(String book) {
		books.add(book);
		System.out.println(book + "added.";)
		
	}
	void removeBook(String book) {
		if(books.remove(book));
		System.out.println(book + "removed.");
		else
			System.out.println(book + "not found.");
	}
	
	void issueBook(String book) {
		if (books.contains(book)) {
			books.remove(book);
			System.out.println(book + "issued.");
			else {
				System.out.println(book + "not available.");
			}
			
		}
		void showBooks() {
			System.out.println("Books in Library:");
			for (int i = 0; i < count; i++);
			System.out.println(i + 1) + "." + books[i];
				
			
		}
		
	}

}
