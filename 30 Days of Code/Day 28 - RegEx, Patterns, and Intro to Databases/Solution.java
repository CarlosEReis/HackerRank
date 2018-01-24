
/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */

import java.util.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Pattern pattern = Pattern.compile("[a-z]+@gmail\\.com");
		List<String> names = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String name = in.next();
			String email = in.next();
			Matcher matcher = pattern.matcher(email);
			if (matcher.find())
				names.add(name);
		}
		in.close();

		Collections.sort(names);

		for (String name : names) {
			System.out.println(name);
		}
	}
}