package Day3;

public class Student {
	
	String name;
	int[] marks = new =new int[4];
	
	void assignMarks(int m1, int m2, int m3) {
		marks[0] = m1;
		marks[1] = m2;
		marks[2] = m3;
	}
	void displayResults() {
		int total = marks[0] + marks[1] + marks[2];
		double average = total / 5.0;
		System.out.println("Name:" + name);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "sana";
		s.assignMarks(70, 80, 50);
		s.displayResults();
	}

}
