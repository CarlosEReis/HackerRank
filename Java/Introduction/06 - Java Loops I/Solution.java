/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}
}
