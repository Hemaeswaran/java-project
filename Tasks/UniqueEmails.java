package Tasks;
import java.util.*;

public class UniqueEmails {
	public static void main(String[] args) {
		HashSet<String> emails = new HashSet<>();
		emails.add("santhu@gmail.com");
		emails.add("riya@gmail.com");
		emails.add("diya@gmail.com");
		
		System.out.println("Unique Emails:");
		for (String email : emails) {
			System.out.println(email);
		}
		
	}

}
