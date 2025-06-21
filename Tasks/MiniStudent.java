package Tasks;
import java.util.*;
public class MiniStudent {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<>();
		HashMap<Integer, String> studentCourses = new HashMap<>();
		
		studentNames.add("Kethirana");
		studentCourses.put(1,"biology");
		

		studentNames.add("Tiffaniya");
		studentCourses.put(2,"chemistry");
		
		int searchId = 1;
		if (studentCourses.containsKey(searchId)) {
			System.out.println("Student ID:" + searchId + "-Course:" + studentCourses.get(searchId));
			
		}
		int deleteId = 2;
		studentCourses.remove(deleteId);
		System.out.println("Deleted student ID:" + deleteId);
		
		
		
	}

}

