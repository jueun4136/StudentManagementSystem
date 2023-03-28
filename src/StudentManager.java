import java.util.Scanner;

public class StudentManager {
	Student student;
	Scanner input;
	public StudentManager(Scanner input) {
		this.input = input;
	}
	
	public void addStudnet(){
		student = new Student();
		
		System.out.print("Student ID: ");
		student.id = input.nextInt();
		input.nextLine();
		
		System.out.print("Student Name: ");
		student.name = input.nextLine();
		

		System.out.print("Student Email: ");
		student.email = input.nextLine();
		
		System.out.print("Student Phone: ");
		student.phone = input.nextLine();

		
	}
	
	public void deleteStudnet() {
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		if (student == null) {
			System.out.println("the student has not been registred");
			return;
		}
		if (student.id == studentId) {
			student = null;
			System.out.println("the student is deleted");
		}
		
	}
	
	
	public void editStudnet() {
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		if(student.id == studentId) {
			System.out.println("the student to be edited is "+studentId);
		}
	}
	
	
	public void viewStudnet() {
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		if(student.id == studentId) {
			student.printInfo();
		}
	}
		
			
	
}
