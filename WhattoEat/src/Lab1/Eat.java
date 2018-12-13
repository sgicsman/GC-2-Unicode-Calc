package Lab1;

import java.util.Scanner;

public class Eat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String eventType = null;
		int partySize;
		String result = null; // Need to review importance of "null" in declaring string vars

		System.out.println("What type of event are you hosting? Please enter casual, semi-formal, or formal:");
		eventType = scnr.next();
		eventType = eventType.toLowerCase(); // Need this to make output grammatical.

		System.out.println("How many guests are you hosting? Please include yourself and enter a number:");
		partySize = scnr.nextInt();

		if (eventType.equalsIgnoreCase("casual")) {

			if (partySize == 1) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " person, we suggest you prepare a sandwich in the microwave.";
			}

			else if (partySize < 13) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you prepare sandwiches in your kitchen.";
			}

			else {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you serve sandwiches prepared by a caterer.";
			}
		}

		if (eventType.equalsIgnoreCase("semi-formal")) {

			if (partySize == 1) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " person, we suggest you prepare fried chicken in the microwave.";
			}

			else if (partySize < 13) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you prepare fried chicken in your kitchen.";
			}

			else {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you serve sandwiches prepared by a caterer.";
			}
		}

		if (eventType.equalsIgnoreCase("formal")) {

			if (partySize == 1) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " person, we suggest you prepare chicken parmesan in the microwave.";
			}

			else if (partySize < 13) {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you prepare chicken parmesan in your kitchen.";
			}

			else {
				result = "Since you're hosting a " + eventType + " event for " + partySize
						+ " people, we suggest you serve chicken parmesan prepared by a caterer.";
			}
		}

		System.out.println(result);

	}
}
