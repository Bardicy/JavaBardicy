package com.syntax.class11;

import java.util.Scanner;

public class Task03StringScanner {

	public static void main(String[] args) {

		// Accept username, password and confirm password from a user
		// and check following requirements:

		// 1. Username and Password cannot be empty,
		// if so→ message=“Username and Password cannot be empty”.
		// 2. Password should be minimum 8 characters, if less → message=“Password is
		// too short”.
		// 3. Password cannot contain username if so, → message=“Password cannot contain
		// username”.
		// 4. Password should match confirmed password, if not → message=“Passwords do
		// not match”.

		// Only after all requirements met → message “Your username and password has
		// been created”

		Scanner input;
		String username;
		String password;
		String confirmedPassword;
		String message=null;

		input = new Scanner(System.in);
		System.out.println("Please enter your username");
		username = input.nextLine();

		System.out.println("Please enter your password");
		password = input.nextLine();

		if (!(username.isEmpty() || password.isEmpty())) {

			if (password.length() >= 8) {

				if (!password.contains(username)) {
					System.out.println("Please confirm password");
					confirmedPassword = input.nextLine();

					if (password.equals(confirmedPassword)) {
						System.out.println("Your account is created");
					} else {
						System.out.println("Passwords do not match");
					}

				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			message = "Username and password cannot be empty";
		}

		

	}

}
