package DAY04;
    import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class StringFile{
	    public static void main(String[] args) {
	        String filePath = "lines.txt";

	      
	        String[] lines = {
	            "First line",
	            "Second line",
	            "Third line",
	            "Fourth line" };

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            for (String line : lines) {
	                writer.write(line);
	                writer.newLine(); 
	            }
	            System.out.println("Lines written to file successfully.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file:");
	            e.printStackTrace();
	        }
	    }
	}



