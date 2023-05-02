import java.util.Scanner;

import java.io.*;
public class MenuManager {
	public static void main(String[] args){
		int num = -1;
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager(input);
		
		while(num != 5) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Studnets");
			System.out.println("2. Delete Studnets");
			System.out.println("3. Edit Studnets");
			System.out.println("4. View Studnets");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 6:");

			num = input.nextInt();
			input.nextLine();
			
			if(num==1) {
				studentManager.addStudnet();
			}else if(num == 2) {
				studentManager.deleteStudnet();
			}else if(num == 3) {
				studentManager.editStudnet();
			}else if(num == 4) {
				studentManager.viewStudnets();
			} else {
				continue;
			}
			
		}	
	}


}
