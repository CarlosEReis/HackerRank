import java.util.Scanner;
import java.util.function.BinaryOperator;

import com.sun.javafx.fxml.expression.BinaryExpression;

/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		System.out.println(consecutiveOne(n));

	}

	public static int consecutiveOne(int n) {
		int count = 0, max = 0;
		int remainder;

		while (n > 0) {
			remainder = n % 2;
			if (remainder == 1)
				count++;
			else
				count = 0;

			max = Math.max(count, max);
			n /= 2;
		}
		return max;
	}
}
