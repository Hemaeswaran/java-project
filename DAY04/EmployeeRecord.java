package DAY04;
    import java.io.*;
	import java.util.*;

	public class EmployeeRecord{
	    static final String FILE = "employees.txt";

	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Exit");
	            int ch = sc.nextInt(); sc.nextLine();

	            if (ch == 1) add(sc);
	            else if (ch == 2) view();
	            else if (ch == 3) update(sc);
	            else if (ch == 4) delete(sc);
	            else break;
	        }
	    }

	    static void add(Scanner sc) throws IOException {
	        BufferedWriter w = new BufferedWriter(new FileWriter(FILE, true));
	        System.out.print("ID: "); String id = sc.nextLine();
	        System.out.print("Name: "); String name = sc.nextLine();
	        System.out.print("Dept: "); String dept = sc.nextLine();
	        System.out.print("Salary: "); String sal = sc.nextLine();
	        w.write(id + "," + name + "," + dept + "," + sal);
	        w.newLine(); w.close();
	        System.out.println("Added.");
	    }

	    static void view() throws IOException {
	        BufferedReader r = new BufferedReader(new FileReader(FILE));
	        String line;
	        while ((line = r.readLine()) != null)
	            System.out.println(line);
	        r.close();
	    }

	    static void update(Scanner sc) throws IOException {
	        System.out.print("ID to update: ");
	        String id = sc.nextLine();

	        File f = new File(FILE), temp = new File("temp.txt");
	        BufferedReader r = new BufferedReader(new FileReader(f));
	        BufferedWriter w = new BufferedWriter(new FileWriter(temp));
	        String line; boolean found = false;

	        while ((line = r.readLine()) != null) {
	            String[] p = line.split(",");
	            if (p[0].equals(id)) {
	                found = true;
	                System.out.print("New Name: "); String name = sc.nextLine();
	                System.out.print("New Dept: "); String dept = sc.nextLine();
	                System.out.print("New Salary: "); String sal = sc.nextLine();
	                w.write(id + "," + name + "," + dept + "," + sal);
	            } else {
	                w.write(line);
	            }
	            w.newLine();
	        }
	        r.close(); w.close();
	        f.delete(); temp.renameTo(f);
	        System.out.println(found ? "Updated." : "ID not found.");
	    }

	    static void delete(Scanner sc) throws IOException {
	        System.out.print("ID to delete: ");
	        String id = sc.nextLine();

	        File f = new File(FILE), temp = new File("temp.txt");
	        BufferedReader r = new BufferedReader(new FileReader(f));
	        BufferedWriter w = new BufferedWriter(new FileWriter(temp));
	        String line; boolean found = false;

	        while ((line = r.readLine()) != null) {
	            String[] p = line.split(",");
	            if (p[0].equals(id)) {
	                found = true; continue;
	            }
	            w.write(line); w.newLine();
	        }
	        r.close(); w.close();
	        f.delete(); temp.renameTo(f);
	        System.out.println(found ? "Deleted." : "ID not found.");
	    }
	}



