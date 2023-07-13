package com.fssa.jaleela.day19.solved;

import java.util.regex.Pattern;

public class UserValidator {
	public static void validate(User user) {

//		regex for password
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
//		regex for email
		String email = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Boolean isMatch = Pattern.matches(regex, user.password);
		Boolean isEmailMatch = Pattern.matches(email, user.email);

		if (user.id > 0) {
			System.out.println("user id is valid");
		} else {
			System.out.println("user id is invalid");
		}
		if (user.name.length() > 2) {
			System.out.println("username is valid");
		} else {
			System.out.println("username is invalid");
		}
		if (isMatch) {
			System.out.println("password is valid");
		} else {
			System.out.println("password is weak");
		}
		if (isEmailMatch) {
			System.out.println("email is valid");
		} else {
			System.out.println("email is invalid");
		}
	}
}


public class TestUserValidator {
	public static void main(String[] args) {
		// test case to check if the valid age is validated correctly
		testPostiveValidateId();

		// test case if exception is thrown if we send a negative or zero value
		testNegativeValidateName();
		
		//test case for user Email
		
		testEmail
	}

	/**
	 * It will pass a positive number to validateAge method and print if the
	 * test case has passed else it will print test case failed
	 */