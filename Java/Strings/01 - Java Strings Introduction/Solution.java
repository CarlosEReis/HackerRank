import java.util.Scanner;

/**
 * 
 * 		@author Carlos Reis
 * 		Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();

		int sumLength = A.length() + B.length();
		String islexicographi = A.compareTo(B) > 0 ? "Yes" : "No";

		String capitalizeFirstLetterA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capitalizeFirstLetterB = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(
				sumLength 
				+ "\n" + islexicographi
				+ "\n" + capitalizeFirstLetterA + " " + capitalizeFirstLetterB
				);
	}
}

