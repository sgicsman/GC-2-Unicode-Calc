package Lab2;

import java.util.Scanner;

public class Unicalc {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String name;
		int length; // # of letters in each name = # of iterations for each loop
		int unicodeValue;
		int sumFirst = 0;
		int sumLast = 0;
		int difference = 0;
		char letter = 0; // temporary holder to find Unicode referent of each letter

		System.out.println("Please enter your first and last names, without spaces, separately.");

		System.out.println("Enter your first name: ");
		name = scnr.next();
		length = name.length() - 1;

		while (length >= 0) {
			letter = name.charAt(length);
			unicodeValue = letter; // translate one letter to unicode value
			sumFirst = sumFirst + unicodeValue; // add that unicode value to the sum (running total)

			length = length - 1;
		}

		System.out.println("Enter your last name: ");
		name = scnr.next();
		length = name.length() - 1;

		while (length >= 0) { // Repeat the loop to get sum of Unicode values for last name.
			letter = name.charAt(length);
			unicodeValue = letter;
			sumLast = sumLast + unicodeValue;

			length = length - 1;
		}

		difference = Math.abs(sumFirst - sumLast);

		System.out.println("The sum of the Unicode values of each letter in your first name is " + sumFirst + ".");
		System.out.println("The sum of the Unicode values of each letter in your last name is " + sumLast + ".");
		System.out.println("The absolute value of the difference between these sums is " + difference + ".");

	}

}
