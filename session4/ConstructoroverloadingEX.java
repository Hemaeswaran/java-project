package session4;

public class ConstructoroverloadingEX {
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructoroverloadingEX(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
		
	}
	
	public ConstructoroverloadingEX(String empname, String location) {
		this(empname, 0, location);  //call invoke using this keyword
	}
	public ConstructoroverloadingEX(String empname, int empid) {
		this(empname,empid,null);
		
	}
	
	public void displayInfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
	public static void main(String[] args) {
		ConstructoroverloadingEX cox = new ConstructoroverloadingEX("Hema", 2201, "Coimbatore");
		
		ConstructoroverloadingEX cox1 = new ConstructoroverloadingEX("santhosh", "Bangalore");
		
		ConstructoroverloadingEX cox2 = new ConstructoroverloadingEX("Shobana", 1306, "null");
		
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	}

}
