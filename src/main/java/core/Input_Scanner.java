package core;

import java.util.Scanner;

public class Input_Scanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner (System.in);
			System.out.print("Enter your first name: ");
			String first_name = s.nextLine();
			System.out.print("Enter your last name: ");
			String last_name = s.nextLine();
			System.out.println("Your full name is: " + first_name + " " + last_name );
			s.close();
	}
}
