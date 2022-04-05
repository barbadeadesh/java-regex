package com.bridgelab.junit;

import java.util.regex.Pattern;

public class UserRegistrationCase {
	
	public boolean validateFirstName(String str) {
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
		return check;
	}

	public static void main(String args[]) {

		System.out.println("Welcome To The Junit");
	}

}
