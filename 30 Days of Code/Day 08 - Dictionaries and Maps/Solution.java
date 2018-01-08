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
		int n = in.nextInt();
		Map<String, Integer> phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			Integer phone = in.nextInt();
			phoneBook.put(name, phone);
		}

		while (in.hasNext()) {
			String nameConsult = in.next();
			if (phoneBook.containsKey(nameConsult)) {
				System.out.println(nameConsult + "=" + phoneBook.get(nameConsult));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}

