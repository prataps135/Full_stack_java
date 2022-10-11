package Assignment;
class Employee{
	int empID;
	String name;
	String dept;
	int salary;
	String address;
	
	Employee(){}
	Employee(int empID, String name, String dept, int salary, String address){
		this.empID = empID;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}
	
	void display() {
		System.out.println("Employee ID = "+empID);
		System.out.println("Employee Name = "+name);
		System.out.println("Employee Department = "+dept);
		System.out.println("Employee Salary = "+salary);
		System.out.println("Employee Address = "+address);
	}
}
public class Assignment1 {
	public static void main(String args[]) {
		Employee emp1 = new Employee(101,"Ram","Sales",10000,"abc");
		Employee emp2 = new Employee(102,"Shyam","Sales",12000,"Abf");
		Employee emp3 = new Employee(103,"Dhanraj","Accounts",18000,"Xyz");
		Employee emp4 = new Employee(104,"Rani","Worker",7000,"EFG");
		Employee emp5 = new Employee(105,"Radha","Head",25000,"GHF");
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
		emp5.display();
	}
}
