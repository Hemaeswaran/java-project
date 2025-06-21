package Tasks;
import java.util.*;
public class CourseEnrollment {
	private ArrayList<String> students = new ArrayList<>();
	private HashMap<String, List<String>> enrollments = new HashMap<>();
	
	public void addStudent(String student) {
		students.add(student);
		enrollments.put(student,  new ArrayList<>());
	}
	public void removeStudent(String student) {
		students.remove(student);
		enrollments.remove(student);
			
		}
	public void displayEnrollments() {
		Iterator<String> iterator = students.iterator();
		while (iterator.hasNext());
		String student = iterator.next();
		System.out.println(student + "enroll in:" + enrollments.get(student));
	}
	
}
        
