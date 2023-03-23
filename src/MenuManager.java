import java.util.Scanner;

import java.io.*;
public class MenuManager {
	public static void main(String[] args) throws IOException {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while(num != 6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Studnets");
			System.out.println("2. Delete Studnets");
			System.out.println("3. Edit Studnets");
			System.out.println("4. View Studnets");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6:");

			num = input.nextInt();
			
			if(num==1) {
				addStudnet();
			}else if(num == 2) {
				deleteStudnet();
			}else if(num == 3) {
				editStudnet();
			}else if(num == 4) {
				viewStudnet();
			} else {
				continue;
			}
			
		}	
	}
	
	
	
	public static void addStudnet() throws IOException {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Student ID: ");
		
		int studentId = input.nextInt();
		input.nextLine();
		
		System.out.print("Student Name: ");
		String studentName = input.nextLine();
		
		
		System.out.print("Student Email: ");
		String studentMail = input.nextLine();
		
		System.out.print("Student Phone: ");
		String studentPhone = input.nextLine();
		
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Email: "+studentMail); 
		System.out.println("Student Phone: "+studentPhone);
		
	}
	
	public static void deleteStudnet() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
		
	}
	
	
	public static void editStudnet() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
	
	
	public static void viewStudnet() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Student ID: ");
		int studentId = input.nextInt();
	}
			
			
			
//			switch(num) {
//				case 1:
//					System.out.print("Student ID: ");
//					int studentId = input.nextInt();
//					System.out.print("Student Name: ");
//					String studentName = input.next();
//					System.out.print("Student Email: ");
//					String studentMail = input.next();
//					System.out.print("Student Phone: ");
//					String studentPhone = input.next();
//					break;
//				case 2: 
//					break;
//				case 3:
//					break;
//				case 4: 
//					System.out.print("Student ID: ");
//					int studentId2 = input.nextInt();
//					break;
//			
//			}
			
			
	
		
		

}
