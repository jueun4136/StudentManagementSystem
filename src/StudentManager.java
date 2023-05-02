import java.util.ArrayList;
import java.util.Scanner;

import Student.HighSchoolStudent;
import Student.Student;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	Scanner input;
	public StudentManager(Scanner input) {
		this.input = input;
	}
	
	public void addStudnet(){
		int kind = 0;
		Student student;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for University ");
			System.out.println("2 for High School ");
			System.out.println("Select num for Student Kind: ");
			kind = input.nextInt();
			input.nextLine();
			if(kind == 1) {
				student = new Student();
				student.getUserInput(input);
				students.add(student);
				break;
				
			}else if(kind == 2) {
				student = new HighSchoolStudent();
				student.getUserInput(input);
				students.add(student);
				break;
			
			}else {
				System.out.println("Select num for Student Kind Between 1 and 2:");
			}
		
		}
		


		
	}
	
	public void deleteStudnet() {
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		int index = -1;
		for(int i=0; i<students.size(); i++) {
			if (students.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		
		if (index >=0) {
			students.remove(index);
			System.out.println("the student("+studentId+") is deleted");
		}
		
		
		
	}
	
	
	public void editStudnet() {
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		
		for( int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			if(studentId == student.getId()) {
				int num = -1;
			
		
				while(num != 5) {
					System.out.println("*** Student Info Edit Menu ***");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit Phone");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1 - 6:");

					num = input.nextInt();
					input.nextLine();
					
					if(num==1) {
						System.out.println("Student ID: ");
						int id = input.nextInt();
						student.setId(id);
					}else if(num == 2) {
						System.out.println("Student name: ");
						String name = input.nextLine();
						student.setName(name);
					}else if(num == 3) {
						System.out.println("Student email: ");
						String email = input.nextLine();
						student.setEmail(email);
					}else if(num == 4) {
						System.out.println("Student phone number: ");
						String phone = input.nextLine();
						student.setPhone(phone);
					} else {
						continue;
					}
					
				}
				
			}
			
		}
//		if(student.id == studentId) {
//			System.out.println("the student to be edited is "+studentId);
//		}
	}
	
	
	public void viewStudnets() {
//		System.out.print("Student ID: ");
//		int studentId = input.nextInt();
		
		for(int i=0; i<students.size(); i++) {
			students.get(i).printInfo();
		}
	
	}
		
			
	
}
