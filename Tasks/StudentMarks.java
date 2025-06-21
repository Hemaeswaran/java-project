package Tasks;
  import java.util.*;

public class StudentMarks {
	public static void main(String[] args) {
		HashMap<String, List<Integer>> studentMarks = new HashMap<>();
		studentMarks.put("john",Arrays.asList(83,89,90));
		studentMarks.put("kethi",Arrays.asList(54,70,60));
		
		for (Map.Entry<String, List<Integer>> entry: studentMarks.entrySet()) {
			String name = entry.getKey();
			List<Integer> marks = entry.getValue();
			double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
			     System.out.println(name + "Average Marks:" + average);
		}
		
	}

}
