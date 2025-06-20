package Day3;

public class Person {
	String name;
	int age;

}
class Employee extends Person{
	double salary,bonus;
	
	void calculateSalary(double basic,double bonus) {
		salary = basic + bonus;
		System.out.println("Total Salary:" + salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "sanjana";
		emp.age = 20;
		emp.calculateSalary(10000,1000);
	}
}
