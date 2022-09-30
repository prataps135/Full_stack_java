package OOPs_with_data_structures;

class Student{
	int registration;
	String StudentName;
	
	Student(int reg_no,String name){
		this.registration = reg_no;
		this.StudentName = name;
	}
}
public class StudentMain {
	public static void main(String[] args) {
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(12251,"Ram");
		arr[1] = new Student(12252,"Shyam");
		arr[2] = new Student(12253,"Sita");
		arr[3] = new Student(12254,"Geeta");
		arr[4] = new Student(12255,"Radha");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Student with Registration number "
					+ arr[i].registration+ " is " +arr[i].StudentName);
		}
	}
}
