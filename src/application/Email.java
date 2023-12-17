package application;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private Integer mailboxCapacity;
	private String alternateEmail;

	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("DEPARTMENT: " + this.department);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		switch (depChoice) {
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "acct";
		case 4:
			return "";
		default:
			return "Invalid params";
		}
	}

	// Generate a random password

	// Set the mailbox capacity

	// Set the alternate email

	// Change the password

	// toString

}
