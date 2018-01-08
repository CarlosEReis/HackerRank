import java.util.Scanner;

/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	static int factorial(int n) {
		// Complete this function
		return (n > 1) ? n * factorial(n - 1) : 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int result = factorial(n);
		System.out.println(result);
	}
}

