package com.bridgelab.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * purpose: Class is created for regex Validation
 * 
 * @author: Adesh
 * @since:31 march 2022
 */
public class Regex {
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

	/**
	 * Create Add Last Name method for getting First Name By Using Expression
	 */

	public static void AddLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Last Name: ");
		String name = sc.nextLine();
		System.out.println("Last Name is: " + name);
		Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z A-Z]{2,})$");
		Matcher matcher = pattern.matcher(name);
		boolean MatchFound = matcher.matches();
		if (MatchFound) {
			System.out.println("Last Name is valid");
		} else {
			System.out.println("Last Name is Invalid");
		}
	}

	/**
	 * Create valid Mail method for getting hole mail Id By Using Expression
	 */
	public static void ValidEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email");
		String email = sc.nextLine();
		System.out.println("Email is: " + email);
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$");
		Matcher matcher = pattern.matcher(email);
		boolean MatchFound = matcher.matches();
		if (MatchFound) {
			System.out.println("Email is Valid");
		} else
			System.out.println("Email is Invalid");
	}

	/**
	 * Create valid MobileNum method for verify mobile number By Using Expression
	 */
	public static void ValidMobileNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mobile number: ");
		String mob = sc.nextLine();
		System.out.println("Mobile Number is: " + mob);
		Pattern pattern = Pattern.compile("^([0-9]{2}) ([1-9]{1}[0-9]{9,})$");
		Matcher matcher = pattern.matcher(mob);
		boolean MatchFound = matcher.matches();
		if (MatchFound) {
			System.out.println("Mobile number is valid");
		} else {
			System.out.println("Mobile Number is Invalid");
		}
	}

	public static void main(String[] args) {
		System.out.println("Wlcome To The Regex");
		AddFirstName();
		AddLastName();
		ValidEmail();
		ValidMobileNum();

	}

}
