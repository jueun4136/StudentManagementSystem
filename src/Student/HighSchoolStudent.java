package Student;

import java.util.Scanner;

public class HighSchoolStudent extends Student {
	public void getUserInput(Scanner input) {
		System.out.print("Student ID: ");
		int id = input.nextInt();
		input.nextLine();
		this.setId(id);
		
		
		System.out.print("Student Name: ");
		String name = input.nextLine();
		this.setName(name);
		
		char answer = 'x';
		while(answer!= 'y' && answer != 'Y' && answer!= 'n' && answer != 'N' ) {
			System.out.print("Do you have an email address? (Y/N): ");
			answer =input.next().charAt(0);
			
			if(answer  == 'y' || answer  == 'Y') {
				System.out.println("Email address: ");
				String email = input.nextLine();
				this.setEmail(email);
				break;
				
			}else if (answer  == 'n' || answer  == 'N') {
				this.setEmail("(X) no email");
				break;
			}else {
				
			}
		}
		
		String email = input.nextLine();
		this.setEmail(email);
		
		System.out.print("Student Phone: ");
		String phone = input.nextLine();
		this.setPhone(phone);
	}

}
