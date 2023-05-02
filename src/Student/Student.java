package Student;

import java.util.Scanner;

public class Student {
	
	protected StudentKind kind = StudentKind.University;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	
	public Student() {}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	
	public Student(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		
		
	}
	
	public void printInfo() {
		System.out.println("id: "+id + ", name: "+ name +", email: "+email+", phone:"+phone );
		
	}

	public StudentKind getKind() {
		return kind;
	}

	public void setKind(StudentKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void getUserInput(Scanner input) {
		System.out.print("Student ID: ");
		int id = input.nextInt();
		input.nextLine();
		this.setId(id);
		System.out.print("Student Name: ");
		String name = input.nextLine();
		this.setName(name);
		System.out.print("Student Email: ");
		String email = input.nextLine();
		this.setEmail(email);
		System.out.print("Student Phone: ");
		String phone = input.nextLine();
		this.setPhone(phone);
	}
}
