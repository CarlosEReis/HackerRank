/**
 * 
 * 		@author Carlos Reis
 * 		Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}
}

class MyRegex {
	// [01]?\\d{1,2}    0 a 199
	// 2[0-4]\\d      200 a 249
	// 25[0-5]        250 a 255

	String n = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	public String pattern = n + "." + n + "." + n + "." + n;
}