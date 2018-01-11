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
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		SortedSet<String> subStrings = new TreeSet<>();
		for (int i = 0; i <= s.length() - k; i++) {
			subStrings.add(s.substring(i, i + k));
		}

		smallest = subStrings.first();
		largest = subStrings.last();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}