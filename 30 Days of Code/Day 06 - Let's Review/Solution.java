import java.util.Scanner;

/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			detachEvenOdd(s);
		}
		in.close();
	}

	public static void detachEvenOdd(String s) {
		StringBuffer even = new StringBuffer();
		StringBuffer odd = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i % 2 == 0) {
				even.append(ch);
			} else {
				odd.append(ch);
			}
		}
		System.out.println(even + " " + odd);
	}
}

