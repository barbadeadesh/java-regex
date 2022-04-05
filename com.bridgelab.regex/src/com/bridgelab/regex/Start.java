package com.bridgelab.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
	
	/**
	 * Create Add First Name method for getting First Name By Using Expression
	 */
	public static void AddFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Name:");
		String name = sc.nextLine();
		System.out.println("First Name is : " + name);
		Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z]{2,})$");
		Matcher matcher = pattern.matcher(name);
		boolean MatchFound = matcher.matches();

		if (MatchFound) {
			System.out.println("Name is Valid");
		} else {
			System.out.println("Name is invalid");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Regex");
		AddFirstName();
	}

}
