import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

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
		sc.close();
		
		String a2 = new StringBuffer(A).reverse().toString();
		String result = A.equals(a2) ? "Yes" : "NO";
		
		System.out.println(result);

	}
}