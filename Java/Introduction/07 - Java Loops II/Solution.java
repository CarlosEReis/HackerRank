/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int result = (int) (a + Math.pow(2, 0) * b);
			System.out.print(result + " ");
			for (int j = 1; j < n; j++) {
				result += (int) Math.pow(2, j) * b;
				System.out.print(result + " ");
			}
			System.out.println();
		}
		in.close();
	}
}