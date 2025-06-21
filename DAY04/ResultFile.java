package DAY04;

  import java.io.*;

	public class ResultFile {
	    public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
	        BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));

	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            String name = parts[0];
	            int total = 0;

	            for (int i = 1; i < parts.length; i++) {
	                total += Integer.parseInt(parts[i]);
	            }

	            double avg = (double) total / (parts.length - 1);
	            writer.write(name + " - Total: " + total + ", Avg: " + String.format("%.2f", avg));
	            writer.newLine();
	        }

	        reader.close();
	        writer.close();
	        System.out.println("Result written to results.txt");
	    }
	}



