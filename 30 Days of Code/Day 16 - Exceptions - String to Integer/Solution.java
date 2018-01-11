import java.util.Scanner;
import java.util.function.BinaryOperator;

import com.sun.javafx.fxml.expression.BinaryExpression;

/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();

		try {
			Integer i = Integer.parseInt(S);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}