/**
 *   File Name: EmployeeEntryApplication.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 31, 2016
 *
 */

package com.sqa.MA;

import java.util.Scanner;

import com.sqa.MA.util.helpers.RequestInput;

/**
 * EmployeeEntryApplication //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EmployeeEntryApplication {

	static String[] names, addresses, ages, cities, phoneNumber, jobTitles;
	static int numOfEmployees;
	static Scanner scanner = new Scanner(System.in);
	static String userName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		welcomeUser();
		getUserDetails();
		requestUserCount();

		for (int i = 0; i < numOfEmployees; i++) {
			addEmployeeInfo(i);
		}
		displayEmployees();
		farwellUser();

	}

	/**
	 * @param i
	 */
	private static void addEmployeeInfo(int i) {
		System.out.println("Can I get Employee " + (i + 1) + "'s name:");
		names[i] = scanner.nextLine();
		System.out.println("Can I get " + names[i] + "'s address:");
		addresses[i] = scanner.nextLine();
		System.out.println("What about their age:");
		ages[i] = scanner.nextLine();
		System.out.println("What city does " + names[i] + " live in:");
		cities[i] = scanner.nextLine();
		System.out.println("What do they do for a living:");
		jobTitles[i] = scanner.nextLine();

	}

	/**
	 *
	 */
	private static void displayEmployees() {
		for (int i = 0; i < names.length; i++) {
			System.out.print("Employee " + (i + 1) + "'s Name: " + names[i]);
			System.out.print("Age: " + ages[i]);
			System.out.print("Address: " + addresses[i]);
			System.out.print("City: " + cities[i]);
			System.out.print("Job Title: " + jobTitles[i] + "\n");
		}
	}

	/**
	 *
	 */
	private static void farwellUser() {
		System.out.println("Thank you for using my application, Have a great day " + userName + "!");
		scanner.close();
		System.exit(0);

	}

	/**
	 *
	 */
	private static void getUserDetails() {

	}

	/**
	 *
	 */
	private static void requestUserCount() {
		numOfEmployees = RequestInput.getInt("How many employees would you like to enter the system?", 1, 2, 3, 4, 5, 6,
				7, 8, 9);

		names = new String[numOfEmployees];
		ages = new String[numOfEmployees];
		cities = new String[numOfEmployees];
		jobTitles = new String[numOfEmployees];
		addresses = new String[numOfEmployees];

	}

	/**
	 *
	 */
	private static void welcomeUser() {
		System.out.println("Welcome to the employees Entry Application");
		System.out.print("Could I get your name please:");
		userName = scanner.nextLine();
	}

}
