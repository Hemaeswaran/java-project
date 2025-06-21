package Tasks;
import java.util.*;
public class StudentSystem {
	public static void main(String[] args) {
		
		// 1. Array list of students
		ArrayList<String> students = new ArrayList<>();
		students.add("Kavi");
		students.add("Sana");
		students.add("Ziya");
		
		System.out.println("Student List using iteratior:");
		Iterator<String> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
			
	}

}
          