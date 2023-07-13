package com.fssa.jaleela.day19.solved;

import java.util.regex.Pattern;

class UserTw {
	int id;
	String name;
	String password;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

public class UserValidatorTwo {
	public static void validate(UserTw user) {

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
	public static void main(String[] args) {
		UserTw UserTw = new UserTw();
		UserTw.setEmail("jalee@");
		UserTw.setId(1);
		UserTw.setName("Jaleela");
		UserTw.setPassword("jaleela123@");
		
		validate(UserTw);
	}
}