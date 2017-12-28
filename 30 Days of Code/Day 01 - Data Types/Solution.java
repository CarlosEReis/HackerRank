/**
 * 
 * 		@author Carlos Reis
 * 		Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */

public class Solution {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int myInt;
		double myDouble;
		String myString;

		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		myInt = scan.nextInt();
		myDouble = scan.nextDouble();
		scan.nextLine();
		myString = scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + myInt);

		/* Print the sum of the double variables on a new line. */
		System.out.println(d + myDouble);

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + myString);

		scan.close();
	}
}